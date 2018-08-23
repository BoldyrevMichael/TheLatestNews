package ru.ma.boldyrev.spring2.thelatestnewssoap.endpoint;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ru.ma.boldyrev.spring2.soap.source_of_earning.*;
import ru.ma.boldyrev.spring2.thelatestnewssoap.client.SourceOfEarningClient;
import ru.ma.boldyrev.spring2.thelatestnewssoap.entity.SourceOfEarning;

import java.util.List;
import java.util.logging.Logger;

@Endpoint
public class SourceOfEarningEndpoint {

    @NotNull
    private final static Logger LOGGER = Logger.getLogger(SourceOfEarningEndpoint.class.getSimpleName());

    @NotNull
    public final static String LOCATION_URI = "/soap/source-of-earning";

    @NotNull
    public final static String PORT_TYPE_NAME = "SourceOfEarningEndpointPort";

    @NotNull
    public final static String NAMESPACE = "http://boldyrev.ma.ru/spring2/soap/source-of-earning";

    @Autowired(required = false)
    private SourceOfEarningClient sourceOfEarningClient;

    @ResponsePayload
    @PayloadRoot(localPart = "pingRequest", namespace = NAMESPACE)
    public PingResponse ping(@RequestPayload final PingRequest request) {
        final PingResponse result = new PingResponse();
        result.setSuccess(true);
        return result;
    }

    @ResponsePayload
    @PayloadRoot(localPart = "testRequest", namespace = NAMESPACE)
    public TestResponse test(@RequestPayload TestRequest request) {
        final TestResponse result = new TestResponse();
        result.setSuccess(true);
        return result;
    }

    @ResponsePayload
    @PayloadRoot(localPart = "getListOfSourceOfEarningRequest", namespace = NAMESPACE)
    public GetListOfSourceOfEarningResponse getListOfSourceOfEarning(@RequestPayload final GetListOfSourceOfEarningRequest request) {
        final GetListOfSourceOfEarningResponse result = new GetListOfSourceOfEarningResponse();
        try {
            final List<SourceOfEarning> listOfSourceOfEarning = sourceOfEarningClient.getListOfSourceOfEarning();
            for (SourceOfEarning sourceOfEarning : listOfSourceOfEarning) {
                result.getRows().add(toRecord(sourceOfEarning));
            }
        } catch (@NotNull final Exception e) {
            LOGGER.severe(e.getMessage());
        }
        return result;
    }

    @ResponsePayload
    @PayloadRoot(localPart = "removeSourceOfEarningRequest", namespace = NAMESPACE)
    public RemoveSourceOfEarningResponse removeSourceOfEarning(@RequestPayload final RemoveSourceOfEarningRequest request) {
        final RemoveSourceOfEarningResponse result = new RemoveSourceOfEarningResponse();
        try {
            sourceOfEarningClient.removeSourceOfEarning(request.getId());
            result.setSuccess(true);
        } catch (@NotNull final Exception e) {
            result.setMessage(e.getMessage());
            result.setSuccess(false);
        }
        return result;
    }

    @ResponsePayload
    @PayloadRoot(localPart = "createSourceOfEarningRequest", namespace = NAMESPACE)
    public CreateSourceOfEarningResponse createSourceOfEarning(@RequestPayload final CreateSourceOfEarningRequest request) {
        final CreateSourceOfEarningResponse result = new CreateSourceOfEarningResponse();
        try {
            sourceOfEarningClient.createSourceOfEarning(
                    request.getName(),
                    request.getPrice(),
                    request.getCategoryOfSourceOfEarningName()
            );
            result.setSuccess(true);
        } catch (@NotNull final Exception e) {
            LOGGER.severe(e.getMessage());
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @NotNull
    private SourceOfEarningRecord toRecord(@NotNull final SourceOfEarning sourceOfEarning) {
        final SourceOfEarningRecord sourceOfEarningRecord = new SourceOfEarningRecord();
        sourceOfEarningRecord.setId(sourceOfEarning.getId());
        sourceOfEarningRecord.setName(sourceOfEarning.getName());
        sourceOfEarningRecord.setPrice(sourceOfEarning.getPrice());
        sourceOfEarningRecord.setExecutionDate(sourceOfEarning.getExecutionDate().toString());
        sourceOfEarningRecord.setCategoryOfSourceOfEarningName(sourceOfEarning.getCategoryOfSourceOfEarning().getName());
        return sourceOfEarningRecord;
    }
}

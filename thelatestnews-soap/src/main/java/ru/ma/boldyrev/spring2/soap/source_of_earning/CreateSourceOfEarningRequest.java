//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.23 at 03:06:57 AM GMT+03:00 
//


package ru.ma.boldyrev.spring2.soap.source_of_earning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="categoryOfSourceOfEarningName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "price",
    "categoryOfSourceOfEarningName"
})
@XmlRootElement(name = "createSourceOfEarningRequest")
public class CreateSourceOfEarningRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String price;
    @XmlElement(required = true)
    protected String categoryOfSourceOfEarningName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the categoryOfSourceOfEarningName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfSourceOfEarningName() {
        return categoryOfSourceOfEarningName;
    }

    /**
     * Sets the value of the categoryOfSourceOfEarningName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfSourceOfEarningName(String value) {
        this.categoryOfSourceOfEarningName = value;
    }

}
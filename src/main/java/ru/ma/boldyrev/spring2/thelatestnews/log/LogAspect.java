package ru.ma.boldyrev.spring2.thelatestnews.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    // определяем срез по всем методам бинов из пакета com.example.aop.service
    @Pointcut("execution(* ru.ma.boldyrev.spring2.thelatestnews.controller..*.*(..))")
    private void getName() {
    }

    // определяем совет (Advice) "ПЕРЕД" выполнением кода бина (класса)
    @Before("getName()")
    public void logBefore(JoinPoint joinPoint) {
        // выводим в консоль информацию о текущей точке соединения
        System.out.println(joinPoint);
    }
}
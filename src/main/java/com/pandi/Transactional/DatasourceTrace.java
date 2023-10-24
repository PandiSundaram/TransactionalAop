package com.pandi.Transactional;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;
import java.sql.Connection;


@Component
@Aspect
public class DatasourceTrace {


    Logger logger =  LoggerFactory.getLogger(DatasourceTrace.class);

    @Around("target(javax.sql.DataSource)")

    public Object datasourcetrace(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        logger.info(proceedingJoinPoint.getSignature().getName());

        Object returnValue = proceedingJoinPoint.proceed();

      // Connection connection =  Proxy.newProxyInstance(Connection.class.getClassLoader(),Class[]{Connection.class},new ConnectionImplProxy((Connection) returnValue);


        return returnValue;
    }


}

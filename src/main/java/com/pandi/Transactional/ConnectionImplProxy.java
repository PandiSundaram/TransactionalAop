package com.pandi.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

public class ConnectionImplProxy implements InvocationHandler {


    Logger logger =  LoggerFactory.getLogger(ConnectionImplProxy.class);
    Connection connection;

    ConnectionImplProxy(Connection connection){
        connection = connection;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        logger.info(method.toGenericString());
         Object returnValue = method.invoke(proxy,args);

         logger.info("return Value "+ returnValue);

        return null;
    }
}

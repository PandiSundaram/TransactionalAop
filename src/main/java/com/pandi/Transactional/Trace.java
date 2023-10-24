package com.pandi.Transactional;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Trace {

      Logger logger = LoggerFactory.getLogger(Trace.class);


      //@Pointcut("com.pandi.Transactional.CustomerService")
      @Pointcut("within(com.pandi.Transactional.CustomerService) || within(com.pandi.Transactional.CustomerSaveService)")
      public void pointcutmethodforSave(){

      }

//      @Pointcut("within(com.pandi.Transactional.CustomerSaveService)")
//      public void pointcutmethodIterate(){
//
//      }



//      @Before("pointcutmethodforSave()")
//      public void aspectmethod(){
//       System.out.println("started");
//      }

      @Around("pointcutmethodforSave()")
      public Object aspectmethodAfter(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
            logger.info("started");
          //  logger.info(proceedingJoinPoint.getSignature().getName());
            Object obj = proceedingJoinPoint.proceed();
            logger.info("completed");
            return obj;
      }

//      @Before("pointcutmethodIterate()")
//      public void aspectmethod1(){
//            System.out.println("sundaram");
//      }

//      @After("pointcutmethod()")
//      public void aspectmethod1(){
//            System.out.println("sundaram 1");
//      }


}

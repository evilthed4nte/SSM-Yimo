package com.yimo.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 写一个方法的前置通知
 */
@Aspect
@Component
public class BeforeAdvice {

    @Order(1)
    @Before("execution(* com.yimo.service.*.*(..))")
    public void methodBefore(){
        System.out.println("-------------我在方法之前--------");
        System.out.println("methodbefore");
    }

    @Order(23)
    @Before("execution(* com.yimo.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("method"+name);
    }
}

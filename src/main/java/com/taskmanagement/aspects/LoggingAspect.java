package com.taskmanagement.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @After("execution(* com.taskmanagement..*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Executed method: " + joinPoint.getSignature().getName());
    }
}

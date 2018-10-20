package com.baizhi.aspec;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * Created by Administrator on 2018/10/18.
 */
@Configuration
@Aspect
public class LogSpect {
    //切入点对应的注解，对应service包下的所有方法
    @Pointcut(value = "execution(* com.baizhi.service.*.*(..))")
    public void pt(){}

    @Before(value = "pt()")//通知注解 绑定切入点的函数方法
    public void test(){
        System.out.println("test()");
    }

    @Around(value = "pt()")//通知注解 绑定切入点的函数方法
    public Object testAr(ProceedingJoinPoint proceedingJoinPoint) {
    System.out.println("方法执行之前");
    Object proceed=null;
    try {
         proceed = proceedingJoinPoint.proceed();
    } catch (Throwable throwable) {
        throwable.printStackTrace();
    }
    System.out.println("方法执行之后");
        return proceed;
    }
}

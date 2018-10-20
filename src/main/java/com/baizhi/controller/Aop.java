package com.baizhi.controller;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Administrator on 2018/10/18.
 */
public class Aop implements MethodInterceptor{
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
      Object o=methodInvocation.proceed();
        return null;

    }
}

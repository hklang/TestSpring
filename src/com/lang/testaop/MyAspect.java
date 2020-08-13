package com.lang.testaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//切面类
@Component
@Aspect
public class MyAspect {
	
  // 前置通知
  @Before("execution(* com.lang.testaop.CounterImpl.*(..))")
  public void myBefore(JoinPoint joinPoint) {
	  System.out.print("前置通知，方法名称：" + joinPoint.getSignature().getName() + "\r\n");
     
  }

  // 后置通知
  @After("execution(* com.lang.testaop.CounterImpl.*(..))")
  public void myAfterReturning(JoinPoint joinPoint) {
      System.out.print("后置通知，方法名称：" + joinPoint.getSignature().getName() + "\r\n");
  }

  // 环绕通知
  public Object myAround(ProceedingJoinPoint proceedingJoinPoint)
          throws Throwable {
      System.out.println("环绕开始"); // 开始
      Object obj = proceedingJoinPoint.proceed(); // 执行当前目标方法
      System.out.println("环绕结束"); // 结束
      return obj;
  }

  // 异常通知
  //@AfterThrowing("execution(* com.lang.testaop.CounterImpl.*(..))")
  public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
      System.out.println("异常通知" + "出错了" + e.getMessage());
  }

  // 最终通知
  public void myAfter() {
      System.out.println("最终通知");
  }
}
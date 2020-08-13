package com.lang.testaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//������
@Component
@Aspect
public class MyAspect {
	
  // ǰ��֪ͨ
  @Before("execution(* com.lang.testaop.CounterImpl.*(..))")
  public void myBefore(JoinPoint joinPoint) {
	  System.out.print("ǰ��֪ͨ���������ƣ�" + joinPoint.getSignature().getName() + "\r\n");
     
  }

  // ����֪ͨ
  @After("execution(* com.lang.testaop.CounterImpl.*(..))")
  public void myAfterReturning(JoinPoint joinPoint) {
      System.out.print("����֪ͨ���������ƣ�" + joinPoint.getSignature().getName() + "\r\n");
  }

  // ����֪ͨ
  public Object myAround(ProceedingJoinPoint proceedingJoinPoint)
          throws Throwable {
      System.out.println("���ƿ�ʼ"); // ��ʼ
      Object obj = proceedingJoinPoint.proceed(); // ִ�е�ǰĿ�귽��
      System.out.println("���ƽ���"); // ����
      return obj;
  }

  // �쳣֪ͨ
  //@AfterThrowing("execution(* com.lang.testaop.CounterImpl.*(..))")
  public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
      System.out.println("�쳣֪ͨ" + "������" + e.getMessage());
  }

  // ����֪ͨ
  public void myAfter() {
      System.out.println("����֪ͨ");
  }
}
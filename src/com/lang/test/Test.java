package com.lang.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Hello Word");
        String xmlPath = "applicationContext.xml";
        // ��ʼ��Spring���������������ļ�
        ApplicationContext cox = new ClassPathXmlApplicationContext(
                xmlPath);
        // ͨ��������ȡpersonDaoʵ��
        CounterImpl con = (CounterImpl) cox.getBean("counter");
        // ���� personDao �� add ()����
        con.add(1, 2);
	}

}
package com.lang.testaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Hello Word");
        String xmlPath = "com/lang/testaop/Context.xml";
        // ��ʼ��Spring���������������ļ�
        ApplicationContext cox = new ClassPathXmlApplicationContext(
                xmlPath);
        // ͨ��������ȡpersonDaoʵ��
        Counter con = (Counter) cox.getBean("counter");
        // ���� personDao �� add ()����
        con.add();
        con.sub();
        con.mul();
        con.div();
        System.out.print(con + "\r\n");
       
        
	}

}

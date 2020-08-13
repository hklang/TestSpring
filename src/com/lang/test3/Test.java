package com.lang.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Hello Word");
        String xmlPath = "ApplicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext cox = new ClassPathXmlApplicationContext(
                xmlPath);
        // 通过容器获取personDao实例
        CounterImpl con = (CounterImpl) cox.getBean("counter");
        // 调用 personDao 的 add ()方法
        con.add();
        con.sub();
        con.mul();
        con.div();
        System.out.print(con + "\r\n");
        con = (CounterImpl) cox.getBean("counter");
        System.out.print(con + "\r\n");
        
	}

}

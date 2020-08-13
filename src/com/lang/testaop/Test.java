package com.lang.testaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Hello Word");
        String xmlPath = "com/lang/testaop/Context.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext cox = new ClassPathXmlApplicationContext(
                xmlPath);
        // 通过容器获取personDao实例
        Counter con = (Counter) cox.getBean("counter");
        // 调用 personDao 的 add ()方法
        con.add();
        con.sub();
        con.mul();
        con.div();
        System.out.print(con + "\r\n");
       
        
	}

}

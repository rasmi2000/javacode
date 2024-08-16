package com.anno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Radio;

public class AutowireTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/anno/beans/autowire-beans.xml"); 
		Radio radio = context.getBean("radio",Radio.class); 
		radio.listen();
		
	}
}

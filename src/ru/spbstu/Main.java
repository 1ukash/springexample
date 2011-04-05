package ru.spbstu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		First first = (First) context.getBean("first");
		System.out.println(first.getName());
		
		Second second = (Second) context.getBean("second");
		System.out.println("second contains first: " + second.getFirst().getName());
	}
}

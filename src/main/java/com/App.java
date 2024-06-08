package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.AddressBean;
import com.bean.BookBean;
import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        
//        System.out.print(s1);
//        System.out.println(s2);
        
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);
//		Student s1 = context.getBean("studentBean",Student.class);
//		Student s2 = context.getBean("studentBean",Student.class);
		
//		AddressBean a1 = context.getBean("Addressbean",AddressBean.class);
//		AddressBean a2 = context.getBean("Addressbean",AddressBean.class);
		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		System.out.println(a1);
//		System.out.println(a2);
		
		BookBean b1 = context.getBean("bookBean",BookBean.class);
		BookBean b2 = context.getBean("bookBean",BookBean.class);
		
		System.out.println(b1);
		System.out.println(b2);
    }
}

package com.manipal.spring_demo_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.spring_demo2.Employee;
import com.manipal.spring_demo2.Organization;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       // ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context=new FileSystemXmlApplicationContext("spring.xml");

		/*Employee obj=(Employee)context.getBean("employee");
		
		System.out.println(obj.getEmpId());
		System.out.println(obj.getEmpName());
		System.out.println(obj.getSalary());
		System.out.println(obj.getAddress());*/
		
		Organization org=(Organization) context.getBean("organization");
		
		System.out.println(org);
		
	
    }
}

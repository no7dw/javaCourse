package com.WadeCourse.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
      ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
      
      Person person  = (Person)context.getBean("person");      
      person.Speak();
      System.out.println(person.toString());
      
      Address address = (Address)context.getBean("address");
      System.out.println(address.toString());
      
      Address address2 = (Address)context.getBean("address2");
      System.out.println(address2.toString());
      
      
      ((FileSystemXmlApplicationContext)context).close();
    }
}

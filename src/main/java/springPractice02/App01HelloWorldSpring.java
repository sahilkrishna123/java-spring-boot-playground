package springPractice02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App01HelloWorldSpring {
    public static void main (String[] args){

        // 1: Launch spring context (launch configuration class)
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


        // 2: Configuration Class
        // Add @Configuration to that class and add @Bean to the functions.

        // 3: Retrieve the bean

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person3Parameter"));

        System.out.println(context.getBean("address2"));

        // You can extract bean by specifying the type
        System.out.println(context.getBean(Address.class));

        // List down all spring beans
        System.out.println(context.getBeanDefinitionCount());

        // Display all beans
        System.out.println("Display all beans");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(context.getBeanDefinitionNames());
    }
}

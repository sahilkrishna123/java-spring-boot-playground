package springPractice02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){ };

record Address (String firstLine, String city){ };
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Sahil";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Moin", 21, new Address("Main Street", "London"));
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address2){
        return new Person(name, age, address2);
        // name, age and address2 are the names of beans.
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("Wall Street", "Los Angles");
    }

    @Bean(name = "address3")
    @Primary // Prioritize this bean
    public Address address3(){
        return new Address("Maskan", "Karachi");
    }
}

package com.siva.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    record Person(String name, int age) {}

    record Address(String street, String city){}
    @Bean
    public String name(){
        return "Siva";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean
    public Person person(){
        return  new Person("Ravi", 25);
    }

    @Bean
    public Address address(){
        return new Address("7765 Highpoint Ridge", "Frisco");
    }
    
}

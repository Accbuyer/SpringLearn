package com.example.springBootLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
//@ComponentScan("com.example.springBootLearn") не нужно, потому что SpringBoot делает это по умолчанию
public class SpringConfig {
    @Bean
    public SomeClassWithoutAnnotation someClassWithoutAnnotation() {
        return new SomeClassWithoutAnnotation();
    }

    public void printInfo(@Autowired SomeClassWithoutAnnotation someClassWithoutAnnotation) {
        if(Objects.nonNull(someClassWithoutAnnotation)) {
            System.out.println("the bean is presented");
        }
    }
}

package com.example.springBootLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class SpringBootLearnApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringBootLearnApplication.class, args);
        SomeClassWithoutAnnotation someClassWithoutAnnotation = configurableApplicationContext.getBean("someClassWithoutAnnotation", SomeClassWithoutAnnotation.class);
        configurableApplicationContext.getBean("springConfig", SpringConfig.class).printInfo(someClassWithoutAnnotation);
        System.out.println(Arrays.toString(configurableApplicationContext.getBeanDefinitionNames()));
    }
}

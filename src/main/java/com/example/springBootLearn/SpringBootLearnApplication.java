package com.example.springBootLearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLearnApplication.class, args);//зачем эта фиша? Она сразу была создана

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SomeClassWithoutAnnotation someClassWithoutAnnotation = context.getBean("someClassWithoutAnnotation", SomeClassWithoutAnnotation.class);
        context.getBean("springConfig", SpringConfig.class).printInfo(someClassWithoutAnnotation);
        System.out.println(context.getBeanDefinitionNames());

        context.close();
    }
}

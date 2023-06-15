package com.siva.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {
              try (var context =
                      new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
                  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
              }
    }

}

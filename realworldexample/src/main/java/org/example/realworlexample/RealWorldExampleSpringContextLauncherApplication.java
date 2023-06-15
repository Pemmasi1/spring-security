package org.example.realworlexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class RealWorldExampleSpringContextLauncherApplication {

    public static void main(String[] args) {
              try (var context =
                      new AnnotationConfigApplicationContext(RealWorldExampleSpringContextLauncherApplication.class)) {
                  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
                  System.out.println(context.getBean(BusinessLogic.class).findMax());
              }
    }

}

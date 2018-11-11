package org.neos.spring.standalone.soccer.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.neos.spring.standalone.soccer")
public class RunApplicationSpring {
    public static  void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(RunApplicationSpring.class);
        context.refresh();
        AppConfig  testBean =  context.getBean("configBean",AppConfig.class);
        System.out.println(testBean.game().playGame());

        System.out.println("-----------------");
        System.out.println("There are: " + context.getBeanDefinitionCount() + " beans");
        for (String nameBean:context.getBeanDefinitionNames()){
            System.out.println("Name Bean: " + nameBean );
        }
        context.close();
    }
}

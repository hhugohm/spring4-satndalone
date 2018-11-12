package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.Game;
import org.neos.spring.standalone.soccer.business.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplicationSpring {
    public static  void main(String args[]){
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Game game1 = context.getBean("game",Game.class);
        System.out.println(game1);

        Team realMadrid = context.getBean("realMadrid",Team.class);
        Game game2 = context.getBean("game",Game.class);
        game2.setAwayTeam(realMadrid);
        System.out.println(game2);
        System.out.println(game1);
        System.out.println("-----------------");
        /*System.out.println("There are: " + context.getBeanDefinitionCount() + " beans");
        for (String nameBean:context.getBeanDefinitionNames()){
            System.out.println("Name Bean: " + nameBean );
        }*/
        context.close();

    }
}

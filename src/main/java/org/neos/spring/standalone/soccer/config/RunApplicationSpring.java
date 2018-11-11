package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.Game;
import org.neos.spring.standalone.soccer.business.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplicationSpring {
    public static  void main(String args[]){
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Game game = context.getBean("game",Game.class);
        Team team = context.getBean("atleticoMadrid", Team.class);
        System.out.println("MY FAVORITE TEAM: "+ team.getName());
        System.out.println(game.playGame());

        System.out.println("-----------------");
        System.out.println("There are: " + context.getBeanDefinitionCount() + " beans");
        for (String nameBean:context.getBeanDefinitionNames()){
            System.out.println("Name Bean: " + nameBean );
        }

    }
}

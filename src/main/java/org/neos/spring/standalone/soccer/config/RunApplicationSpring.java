package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplicationSpring {
    public static  void main(String args[]){
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        Game game = context.getBean("game",Game.class);
        System.out.println(game.playGame());
    }
}

package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.Game;
import org.neos.spring.standalone.soccer.business.Team;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "org.neos.spring.standalone.soccer.config")
public class RunApplicationSpring {
    public static  void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(RunApplicationSpring.class);
        context.refresh();
        AppConfig  testBean =  context.getBean("configBean",AppConfig.class);

        Game game1 = testBean.game();
        System.out.println(game1);
        System.out.println("-----------------");
        AppConfig  testBean2 =  context.getBean("configBean",AppConfig.class);
        Game game2 = testBean2.game();
        Team realMadrid = context.getBean("realMadrid",Team.class);
        game2.setAwayTeam(realMadrid);
        System.out.println(game2);
        System.out.println(game1);

        context.close();
    }
}

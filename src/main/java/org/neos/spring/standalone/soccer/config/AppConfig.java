package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.neos.spring.standalone.soccer.domain")
public class AppConfig {

    @Autowired
    @Qualifier("manchesterCity")
    private Team home;

    @Autowired
    @Qualifier("realMadrid")
    private Team away;

    @Bean
    public Game game(){
       return new SoccerGame(home,away);
    }

}

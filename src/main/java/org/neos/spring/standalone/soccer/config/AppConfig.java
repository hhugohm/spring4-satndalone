package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;
import org.neos.spring.standalone.soccer.business.SoccerGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("configBean")
public class AppConfig {
    @Autowired
    @Qualifier("manchesterCity")
    private Team manchester;
    @Autowired
    private Team realMadrid;

    @Bean
    public Game game(){
       return new SoccerGame(manchester,realMadrid);
    }
}

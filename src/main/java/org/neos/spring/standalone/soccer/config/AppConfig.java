package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfig2.class)
public class AppConfig {

    @Autowired
    private Team atleticoMadrid;

    @Bean
    public Game game(){
       return new SoccerGame(realMadrid(),atleticoMadrid);
    }
    @Bean
    public Team realMadrid(){
        return new RealMadrid();
    }
    @Bean
    public Team manchesterCity(){
        return new Manchester();
    }

}

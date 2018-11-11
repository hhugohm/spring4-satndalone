package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Game game(){
        return new SoccerGame(realMadrid(),manchesterCity());
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

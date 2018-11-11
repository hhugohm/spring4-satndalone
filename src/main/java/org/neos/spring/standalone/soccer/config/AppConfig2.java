package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.AtleticoMadrid;
import org.neos.spring.standalone.soccer.business.Game;
import org.neos.spring.standalone.soccer.business.SoccerGame;
import org.neos.spring.standalone.soccer.business.Team;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public Team atleticoMadrid(){
        return new AtleticoMadrid();
    }
}

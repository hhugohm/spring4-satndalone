package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import java.text.NumberFormat;
import java.util.List;


@Configuration
@ComponentScan(basePackages = "org.neos.spring.standalone.soccer")
public class AppConfig {

    @Autowired
    private List<Team> listTeams;

   // @Bean(initMethod = "startGame", destroyMethod = "endGame")
    @Bean
    //@Scope("prototype")
    public Game game(){
        return new SoccerGame(listTeams.get(0),listTeams.get(1));
    }
    @Bean
    public NumberFormat nf(){
        return NumberFormat.getCurrencyInstance();
    }
}

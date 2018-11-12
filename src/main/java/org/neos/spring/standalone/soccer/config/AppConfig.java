package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;
import java.util.List;


@Configuration
@ComponentScan(basePackages = "org.neos.spring.standalone.soccer.domain")
public class AppConfig {

    @Autowired
    private List<Team> listTeams;
    @Bean
    @Scope("prototype")
    public Game game(){
        return new SoccerGame(listTeams.get(0),listTeams.get(1));
    }

}

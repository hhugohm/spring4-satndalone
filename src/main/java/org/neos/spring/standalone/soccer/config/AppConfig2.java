package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.domain.AtleticoMadrid;
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

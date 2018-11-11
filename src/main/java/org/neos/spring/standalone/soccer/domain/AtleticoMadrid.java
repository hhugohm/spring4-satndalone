package org.neos.spring.standalone.soccer.domain;

import org.neos.spring.standalone.soccer.business.Team;
import org.springframework.stereotype.Component;

@Component
public class AtleticoMadrid implements Team {
    @Override
    public String getName() {
        return "ATLETICO DE MADRID";
    }
}

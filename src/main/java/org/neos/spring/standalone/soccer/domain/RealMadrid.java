package org.neos.spring.standalone.soccer.domain;

import org.neos.spring.standalone.soccer.business.Team;
import org.springframework.stereotype.Component;

@Component
public class RealMadrid implements Team {
    @Override
    public String getName() {
        return "REAL MADRID";
    }
}

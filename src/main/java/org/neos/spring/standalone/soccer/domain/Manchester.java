package org.neos.spring.standalone.soccer.domain;

import org.neos.spring.standalone.soccer.business.Team;
import org.springframework.stereotype.Component;

@Component("manchesterCity")
public class Manchester implements Team {
    @Override
    public String getName() {
        return "MANCHERSTE CITY";
    }
}

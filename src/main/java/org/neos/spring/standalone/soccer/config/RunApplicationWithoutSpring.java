package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;
import org.neos.spring.standalone.soccer.domain.Manchester;
import org.neos.spring.standalone.soccer.domain.RealMadrid;

public class RunApplicationWithoutSpring {

    public static void main(String args[]){
        Team realMadrid = new RealMadrid();
        Team manchesterCity = new Manchester();
        Game game =new SoccerGame(realMadrid,manchesterCity);
        System.out.println(game.playGame());
    }
}

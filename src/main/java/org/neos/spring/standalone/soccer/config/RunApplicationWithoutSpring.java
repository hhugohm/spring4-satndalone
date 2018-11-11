package org.neos.spring.standalone.soccer.config;

import org.neos.spring.standalone.soccer.business.*;

public class RunApplicationWithoutSpring {

    public static void main(String args[]){
        Team realMadrid = new RealMadrid();
        Team manchesterCity = new Manchester();
        Game game =new SoccerGame(realMadrid,manchesterCity);
        System.out.println(game.playGame());
    }
}

package org.neos.spring.standalone.soccer.business;

public class SoccerGame  implements Game {
    private Team homeTeam;
    private Team awayTeam;

    public SoccerGame(){}

    public SoccerGame(Team homeTeam,Team awayTeam){
      this.homeTeam=homeTeam;
      this.awayTeam=awayTeam;
    }

    @Override
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam=homeTeam;
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam=awayTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public String playGame() {
        return Math.random() <0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }

    @Override
    public String toString(){
        return String.format("Game between:  %s vs %s", this.homeTeam.getName() ,this.awayTeam.getName());
    }

}

package sample;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class FootballClub extends SportsClub implements Serializable {


    private int wins;
    private int draws;
    private int defeats;
    private int noOfMatches;
    private int noOfGoalsReceived;
    private int noOfGoalsScored;
    private int noOfPoints;
    private int goalDifference= noOfGoalsScored-noOfGoalsReceived;


    public FootballClub() {

    }

    public FootballClub(String name, int sportsClubId, String location, String country, int contactNo, int wins) {
        super(name, sportsClubId, location, country, contactNo);
        this.wins = wins;
    }

    public FootballClub(String name, int sportsClubId, String location, String country, int contactNo, int wins, int draws, int defeats, int noOfMatches, int noOfGoalsReceived, int noOfGoalsScored, int noOfPoints, int goalDifference) {
        super( name, sportsClubId,location, country, contactNo);
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
        this.noOfMatches = noOfMatches;
        this.noOfGoalsReceived = noOfGoalsReceived;
        this.noOfGoalsScored = noOfGoalsScored;
        this.noOfPoints = noOfPoints;
        this.goalDifference = goalDifference;

    }



    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public int getNoOfGoalsReceived() {
        return noOfGoalsReceived;
    }

    public void setNoOfGoalsReceived(int noOfGoalsReceived) {
        this.noOfGoalsReceived = noOfGoalsReceived;
    }

    public int getNoOfGoalsScored() {
        return noOfGoalsScored;
    }

    public void setNoOfGoalsScored(int noOfGoalsScored) {
        this.noOfGoalsScored = noOfGoalsScored;
    }

    public int getNoOfPoints() {
        return noOfPoints;
    }

    public void setNoOfPoints(int noOfPoints) {
        this.noOfPoints = noOfPoints;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    @Override
    public String toString() {
        return
                "Name="+getName()+",ClubId="+getSportsClubId()+",Location="+getLocation()+",Country="+getCountry()+",ContactNo="+getContactNo()+
                        ",wins=" + wins +
                        ", draws=" + draws +
                        ", defeats=" + defeats +
                        ", noOfMatches=" + noOfMatches +
                        ", noOfGoalsReceived=" + noOfGoalsReceived +
                        ", noOfGoalsScored=" + noOfGoalsScored +
                        ", noOfPoints=" + noOfPoints +
                        ", goalDifference=" + goalDifference +
                        '}';
    }
}


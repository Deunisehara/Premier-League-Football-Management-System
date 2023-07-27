package sample;

import java.util.Date;
import java.util.Objects;

public class UniversityFootballClub extends FootballClub {


    private String universityName;
    private String uniLocation;
    private String clubCoachName;
    private int numOfMembers;


    public UniversityFootballClub() {
    }

    public UniversityFootballClub(String name, int sportsClubId, String location, String country, int contactNo, int wins) {
        super(name, sportsClubId, location, country, contactNo, wins);
    }

    public UniversityFootballClub(String name, int sportsClubId, String location, String country, int contactNo, int wins, int draws, int defeats, int noOfMatches, int noOfGoalsReceived, int noOfGoalsScored, int noOfPoints, int goalDifference, String universityName, String uniLocation, String clubCoachName, int numOfMembers) {
        super(name,sportsClubId,location, country, contactNo, wins, draws, defeats, noOfMatches, noOfGoalsReceived, noOfGoalsScored, noOfPoints,  goalDifference);
        this.universityName = universityName;
        this.uniLocation = uniLocation;
        this.clubCoachName = clubCoachName;
        this.numOfMembers = numOfMembers;

    }



    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniLocation() {
        return uniLocation;
    }

    public void setUniLocation(String uniLocation) {
        this.uniLocation = uniLocation;
    }

    public String getClubCoachName() {
        return clubCoachName;
    }

    public void setClubCoachName(String clubCoachName) {
        this.clubCoachName = clubCoachName;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    @Override
    public String toString() {
        return  "Name="+getName()+",ClubId="+getSportsClubId()+",Location="+getLocation()+",Country="+getCountry()+",ContactNo="+getContactNo()+
                ",wins=" + getWins() +
                ", draws=" + getDraws() +
                ", defeats=" + getDraws() +
                ", noOfMatches=" + getNoOfMatches() +
                ", noOfGoalsReceived=" + getNoOfGoalsReceived() +
                ", noOfGoalsScored=" + getNoOfGoalsScored() +
                ", noOfPoints=" + getNoOfPoints() +
                ", goalDifference=" + getGoalDifference() +
                ",universityName='" + universityName + '\'' +
                ", uniLocation='" + uniLocation + '\'' +
                ", clubCoachName='" + clubCoachName + '\'' +
                ", numOfMembers=" + numOfMembers +
                '}';
    }
}

package sample;


import java.util.Objects;

public class SchoolFootballClub extends FootballClub {


    private String schoolName;
    private String schoolLocation;
    private String schoolCoachName;
    private int numOfClubMembers;


    public SchoolFootballClub() {
    }

    public SchoolFootballClub(String name, int sportsClubId, String location, String country, int contactNo, int wins) {
        super(name, sportsClubId, location, country, contactNo, wins);
    }

    public SchoolFootballClub(String name, int sportsClubId, String location, String country, int contactNo, int wins, int draws, int defeats, int noOfMatches, int noOfGoalsReceived, int noOfGoalsScored, int noOfPoints, int goalDifference, String schoolName, String schoolLocation, String schoolCoachName, int numOfClubMembers) {
        super( name,sportsClubId,location, country, contactNo, wins, draws, defeats, noOfMatches, noOfGoalsReceived, noOfGoalsScored, noOfPoints,  goalDifference);
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
        this.schoolCoachName = schoolCoachName;
        this.numOfClubMembers = numOfClubMembers;

    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    public String getSchoolCoachName() {
        return schoolCoachName;
    }

    public void setSchoolCoachName(String schoolCoachName) {
        this.schoolCoachName = schoolCoachName;
    }

    public int getNumOfClubMembers() {
        return numOfClubMembers;
    }

    public void setNumOfClubMembers(int numOfClubMembers) {
        this.numOfClubMembers = numOfClubMembers;
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
                ",schoolName='" + schoolName + '\'' +
                ", schoolLocation='" + schoolLocation + '\'' +
                ", schoolCoachName='" + schoolCoachName + '\'' +
                ", numOfClubMembers=" + numOfClubMembers +
                '}';
    }

}

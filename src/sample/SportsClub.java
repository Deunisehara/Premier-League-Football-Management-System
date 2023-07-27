package sample;

import java.io.Serializable;
import java.util.Objects;

public class SportsClub implements Serializable {

    private String name;
    private int sportsClubId;
    private String location;
    private String country;
    private int contactNo;



    public SportsClub() {
    }

    public SportsClub(String name,int sportsClubId, String location, String country,int contactNo) {
        this.name = name;
        this.sportsClubId=sportsClubId;
        this.location = location;
        this.country = country;
        this.contactNo=contactNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSportsClubId() {
        return sportsClubId;
    }

    public void setSportsClubId(int sportsClubId) {
        this.sportsClubId = sportsClubId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return
                " name='" + name + '\'' +
                        ", sportsClubId=" + sportsClubId +
                        ", location='" + location + '\'' +
                        ", country='" + country + '\'' +
                        ", contactNo=" + contactNo +
                        '}';
    }
}


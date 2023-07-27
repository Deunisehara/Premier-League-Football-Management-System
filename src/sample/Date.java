package sample;

import java.io.Serializable;

public class Date extends Match implements Serializable {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
    setDay(day);
    setMonth(month);
    setYear(year);
    }

    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }

    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month=month;
    }

    public int getYear(int Year){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void date(int day,int month,int year){


    }
    public String toString(){
//        return "Date [  " + this.day + "." + this.month + "." + this.year + " ] ";
        return day + "." + month + "." + year;
    }


}

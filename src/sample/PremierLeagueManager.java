package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

import static java.util.Comparator.comparing;

public class PremierLeagueManager implements LeagueManager,Serializable {

    Scanner sc = new Scanner(System.in);
    SportsClub SportsClub = new SportsClub();
    FootballClub FootballClub = new FootballClub();
    SchoolFootballClub SchoolFootballClub = new SchoolFootballClub();
    UniversityFootballClub UniversityFootballClub= new UniversityFootballClub();




    private String name;
    private int sportsClubId;
    private String location;
    private String country;
    private int contactNo;
    private int wins;
    private int draws;
    private int defeats;
    private int noOfMatches;
    private int noOfGoalsReceived;
    private int noOfGoalsScored;
    private int noOfPoints;
    private int goalDifference= noOfGoalsScored-noOfGoalsReceived;
    private String universityName;
    private String uniLocation;
    private String clubCoachName;
    private int numOfMembers;
    private String schoolName;
    private String schoolLocation;
    private String schoolCoachName;
    private int numOfClubMembers;
    private int day;
    private int month;
    private int year;
    private int Date;
    private FootballClub homeTeam;
    private FootballClub awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private Date playedMatchDate;


    private List<FootballClub> footballClubList = new ArrayList<>();
    private List<Match> addPlayedMatch=new ArrayList<>();





    private String category;






    @Override
    public void Add(String insert) {

        //choosing an option
        sc.nextLine();
        System.out.println("Enter an option  \n f-Football Club \n s-School Football Club \n u- University football club  ");
        System.out.println("--------------------------Select an option------------------------------- ");
        insert = sc.nextLine().toLowerCase();

        if (insert.equals("f")) {
            category = "Football club";
            insert = sc.nextLine();

            //enter name
            System.out.println("\n Enter club name : ");
            name = sc.nextLine().toLowerCase();
            FootballClub.setName(name);

            //enter club id
            System.out.println("\n Enter the sports club Id : ");
            sportsClubId = sc.nextInt();
            FootballClub.setSportsClubId(sportsClubId);


            sc.nextLine();
            //enter location
            System.out.println("\n Enter location : ");
            location = sc.nextLine().toLowerCase();
            FootballClub.setLocation(location);

            //enter country
            System.out.println("\n Enter country : ");
            country = sc.nextLine().toLowerCase();
            FootballClub.setCountry(country);

            //enter contact number
            System.out.println("\n Enter contact number : ");
            contactNo = sc.nextInt();
            FootballClub.setContactNo(contactNo);

            //enter wins
            System.out.println("\n Enter the number of wins : ");
            wins = sc.nextInt();
            FootballClub.setWins(wins);


            //enter draws
            System.out.println("\n Enter the number of draws : ");
            draws = sc.nextInt();
            FootballClub.setDraws(draws);

            //enter defeats
            System.out.println("\n Enter the number of defeats : ");
            defeats = sc.nextInt();
            FootballClub.setDefeats(defeats);

            //enter number of matches played
            System.out.println("\n Enter the number of number of matches played : ");
            noOfMatches = sc.nextInt();
            FootballClub.setNoOfMatches(noOfMatches);

            //enter number of goals received
            System.out.println("\n Enter the number of goals received : ");
            noOfGoalsReceived = sc.nextInt();
            FootballClub.setNoOfGoalsReceived(noOfGoalsReceived);

            //enter number of goals scored
            System.out.println("\n Enter the number of goals scored : ");
            noOfGoalsScored = sc.nextInt();
            FootballClub.setNoOfGoalsScored(noOfGoalsScored);

            //enter number of points
            System.out.println("\n Enter the number of points : ");
            noOfPoints = sc.nextInt();
            FootballClub.setNoOfPoints(noOfPoints);

            goalDifference = noOfGoalsScored - noOfGoalsReceived;


            FootballClub footballClub = new FootballClub(name, sportsClubId, location, country, contactNo, wins, draws, defeats, noOfMatches, noOfGoalsReceived, noOfGoalsScored, noOfPoints, goalDifference);
            footballClubList.add(footballClub);
        }


        if (insert.equals("s")) {
            category = "School football club";
            sc.nextLine();

            //enter name
            System.out.println("\n Enter club name : ");
            name = sc.nextLine().toLowerCase();
            SchoolFootballClub.setName(name);

            //enter club id
            System.out.println("\n Enter the sports club Id : ");
            sportsClubId = sc.nextInt();
            SchoolFootballClub.setSportsClubId(sportsClubId);


            sc.nextLine();
            //enter location
            System.out.println("\n Enter location : ");
            location = sc.nextLine().toLowerCase();
            SchoolFootballClub.setLocation(location);

            //enter country
            System.out.println("\n Enter country : ");
            country = sc.nextLine().toLowerCase();
            SchoolFootballClub.setCountry(country);

            //enter contact number
            System.out.println("\n Enter contact number : ");
            contactNo = sc.nextInt();
            SchoolFootballClub.setContactNo(contactNo);

            //enter wins
            System.out.println("\n Enter the number of wins : ");
            wins = sc.nextInt();
            SchoolFootballClub.setWins(wins);


            //enter draws
            System.out.println("\n Enter the number of draws : ");
            draws = sc.nextInt();
            SchoolFootballClub.setDraws(draws);

            //enter defeats
            System.out.println("\n Enter the number of defeats : ");
            defeats = sc.nextInt();
            SchoolFootballClub.setDefeats(defeats);

            //enter number of matches played
            System.out.println("\n Enter the number of number of matches played : ");
            noOfMatches = sc.nextInt();
            SchoolFootballClub.setNoOfMatches(noOfMatches);

            //enter number of goals received
            System.out.println("\n Enter the number of goals received : ");
            noOfGoalsReceived = sc.nextInt();
            SchoolFootballClub.setNoOfGoalsReceived(noOfGoalsReceived);

            //enter number of goals scored
            System.out.println("\n Enter the number of goals scored : ");
            noOfGoalsScored = sc.nextInt();
            SchoolFootballClub.setNoOfGoalsScored(noOfGoalsScored);

            //enter number of points
            System.out.println("\n Enter the number of points : ");
            noOfPoints = sc.nextInt();
            SchoolFootballClub.setNoOfPoints(noOfPoints);

            sc.nextLine();
            //enter the school name
            System.out.println("\n Enter school name : ");
            schoolName = sc.nextLine().toLowerCase();
            SchoolFootballClub.setSchoolName(schoolName);

            //enter the school location
            System.out.println("\n Enter school location : ");
            schoolLocation = sc.nextLine().toLowerCase();
            SchoolFootballClub.setSchoolLocation(schoolLocation);

            //enter the school coach name
            System.out.println("\n Enter school coach name : ");
            schoolCoachName = sc.nextLine().toLowerCase();
            SchoolFootballClub.setSchoolCoachName(schoolCoachName);

            //enter the num of club members
            System.out.println("\n Enter the number of club members : ");
            numOfClubMembers = sc.nextInt();
            SchoolFootballClub.setNumOfClubMembers(numOfClubMembers);

            goalDifference = noOfGoalsScored - noOfGoalsReceived;


            SchoolFootballClub schoolFootballClub = new SchoolFootballClub(name, sportsClubId, location, country, contactNo, wins, draws, defeats, noOfMatches, noOfGoalsReceived, noOfGoalsScored, noOfPoints, goalDifference, schoolName, schoolLocation, schoolCoachName, numOfClubMembers);
            footballClubList.add(schoolFootballClub);


        } else if (insert.equals("u")) {
            category = "University football club";


            sc.nextLine();

            //enter name
            System.out.println("\n Enter club name : ");
            name = sc.nextLine().toLowerCase();
            UniversityFootballClub.setName(name);

            //enter club id
            System.out.println("\n Enter the sports club Id : ");
            sportsClubId = sc.nextInt();
            UniversityFootballClub.setSportsClubId(sportsClubId);


            sc.nextLine();
            //enter location
            System.out.println("\n Enter location : ");
            location = sc.nextLine().toLowerCase();
            UniversityFootballClub.setLocation(location);

            //enter country
            System.out.println("\n Enter country : ");
            country = sc.nextLine().toLowerCase();
            UniversityFootballClub.setCountry(country);

            //enter contact number
            System.out.println("\n Enter contact number : ");
            contactNo = sc.nextInt();
            UniversityFootballClub.setContactNo(contactNo);

            //enter wins
            System.out.println("\n Enter the number of wins : ");
            wins = sc.nextInt();
            UniversityFootballClub.setWins(wins);


            //enter draws
            System.out.println("\n Enter the number of draws : ");
            draws = sc.nextInt();
            UniversityFootballClub.setDraws(draws);

            //enter defeats
            System.out.println("\n Enter the number of defeats : ");
            defeats = sc.nextInt();
            UniversityFootballClub.setDefeats(defeats);

            //enter number of matches played
            System.out.println("\n Enter the number of number of matches played : ");
            noOfMatches = sc.nextInt();
            UniversityFootballClub.setNoOfMatches(noOfMatches);

            //enter number of goals received
            System.out.println("\n Enter the number of goals received : ");
            noOfGoalsReceived = sc.nextInt();
            UniversityFootballClub.setNoOfGoalsReceived(noOfGoalsReceived);

            //enter number of goals scored
            System.out.println("\n Enter the number of goals scored : ");
            noOfGoalsScored = sc.nextInt();
            UniversityFootballClub.setNoOfGoalsScored(noOfGoalsScored);

            //enter number of points
            System.out.println("\n Enter the number of points : ");
            noOfPoints = sc.nextInt();
            UniversityFootballClub.setNoOfPoints(noOfPoints);


            sc.nextLine();

            //enter the university name
            System.out.println("\n Enter  university name : ");
            universityName = sc.nextLine().toLowerCase();
            UniversityFootballClub.setUniversityName(universityName);

            //enter the university location
            System.out.println("\n Enter  university location : ");
            uniLocation = sc.nextLine().toLowerCase();
            UniversityFootballClub.setUniLocation(uniLocation);

            //enter the university coach name
            System.out.println("\n Enter university coach name : ");
            clubCoachName = sc.nextLine().toLowerCase();
            UniversityFootballClub.setClubCoachName(clubCoachName);

            //enter the num of club members
            System.out.println("\n Enter the number of club members : ");
            numOfMembers = sc.nextInt();
            UniversityFootballClub.setNumOfMembers(numOfMembers);

            goalDifference = noOfGoalsScored - noOfGoalsReceived;

            UniversityFootballClub universityFootballClub = new UniversityFootballClub(name, sportsClubId, location, country, contactNo, wins, draws, defeats, noOfMatches, noOfGoalsReceived, noOfGoalsScored, noOfPoints, goalDifference, universityName, uniLocation, clubCoachName, numOfMembers);
            footballClubList.add(universityFootballClub);
        }


        System.out.println(footballClubList);
        System.out.println("************* Successfully added ******************");

    }

    @Override
    public void Delete() {
        sc.nextLine();
        System.out.println("Please enter the name you want to delete");
        String name=sc.nextLine();
        if(footballClubList.isEmpty()){
            System.out.println("Database is empty");
        }

        else {

            for (FootballClub footballClub : footballClubList) {
                if (footballClub.getName().equals(name)) {

                    footballClubList.remove(footballClub);
                    System.out.println(name+ " has been successfully removed");
                    return;
                }

            }
            System.out.println("Invalid club");

        }

    }

    @Override
    public void DisplayStat() {
        boolean isAvailable = false;
        if(footballClubList.size()==0){
            System.out.println("List is empty");

        }
        for (FootballClub footballClub : footballClubList) {
            isAvailable = true;

            if (name.equals(footballClub.getName())) {
                System.out.println("----------------------------------------------------");
                System.out.println("Club Id-:" + footballClub.getSportsClubId());
                System.out.println("Location-:" + footballClub.getLocation());
                System.out.println("Country-:" + footballClub.getCountry());
                System.out.println("Wins-:" + footballClub.getWins());
                System.out.println("Draws-:" + footballClub.getDraws());
                System.out.println("Defeats-:" + footballClub.getDefeats());
                System.out.println("Matches-:" + footballClub.getNoOfMatches());
                System.out.println("Received goals-:" + footballClub.getNoOfGoalsReceived());
                System.out.println("Scored goals-:" + footballClub.getNoOfGoalsScored());
                System.out.println("No of points-:" + footballClub.getNoOfPoints());
                System.out.println("Goal difference-:" + footballClub.getGoalDifference());
                System.out.println("-----------------------------------------------------------");

            }
        }
        if (!isAvailable) {
            System.out.println("Enter a valid club");
        }

    }

    @Override
    public void DisplayPremierLeagueTable() {
        if(footballClubList.isEmpty()){
            System.out.println("Table is empty");
        }

        else {

            footballClubList.sort(Comparator.comparing(sample.FootballClub::getNoOfPoints).thenComparing(sample.FootballClub::getGoalDifference));
            Collections.reverse(footballClubList);


            System.out.println("**************************************************************************************************************************************");
            System.out.printf("%10s %30s %20s %5s %5s %5s %10s %10s %10s ", "Name", " ID", "Wins", "Draws", "Defeats", "Points", "Scored", "Received", "Goal difference");
            System.out.println();
            System.out.println("**************************************************************************************************************************************");
            for (FootballClub footballClub : footballClubList) {
                System.out.format("%10s %30s %20s %5s %5s %5s %10s %10s %10s",
                        footballClub.getName(), footballClub.getSportsClubId(), footballClub.getWins(), footballClub.getDraws(), footballClub.getDefeats(), footballClub.getNoOfPoints(), footballClub.getNoOfGoalsScored(), footballClub.getNoOfGoalsReceived(), footballClub.getGoalDifference());
                System.out.println();
            }
            System.out.println("**************************************************************************************************************************************");
        }

    }

    @Override
    public void Save(String PremierLeague) throws IOException {
        System.out.println(footballClubList);

        FileOutputStream fileOutputStream = new FileOutputStream(PremierLeague);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        for (FootballClub footballClub : footballClubList) {
            objectOutputStream.writeObject(footballClub);

        }

        System.out.println("######### Sports clubs have been successfully saved #########");

    }



    public void retrieveData(String PremierLeague) throws IOException, ClassNotFoundException {
        File getData = new File("Premier League.txt");
        FileInputStream fileInputStream = new FileInputStream(getData);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        for (;;) {
            try {
                footballClubList.add((FootballClub) objectInputStream.readObject());
            } catch (EOFException e) {
                break;
            }
        }
        System.out.println("######### Sports clubs have been loaded successfully #########");


    }

    public List<sample.FootballClub> getArray(){
        return footballClubList;
    }

    public List<Match> getMatchArray(){
        return addPlayedMatch;
    }


    @Override
    public void AddPlayedMatch() {

        Date date=new Date(day,month,year);

        boolean loopVal = true;
        do {
            System.out.println("*************** Enter the match date ***************");

            //enter day
            System.out.println("\n Please enter the day : ");
            int day = sc.nextInt();
            date.setDay(day);


            //enter month
            System.out.println("\n Please enter the month : ");
            int month = sc.nextInt();
            date.setMonth(month);

            //enter year
            System.out.println("\n Please enter the year : ");
            int year = sc.nextInt();
            date.setYear(year);

            if (year > 0 && month < 13 && month > 0 && day < 32 && 0< day ) {
                break;
            }
            else if (day==0) System.out.println("Invalid date input!");
            else if (month%2==1 && 30<day) System.out.println("Invalid date input!");
            else if (month==7||month%2==0 && day<31) System.out.println("Invalid date input!");
            else if (month==2 && day>29 && year%4==0 ) System.out.println("Invalid date input!");
            else if (month==2 && day>28) System.out.println("Invalid date input!");
            else if (month>12  && month<31) System.out.println("Invalid date input!");


            else {
                System.out.println("Enter a valid date");
            }

        }

        while (loopVal);
            System.out.println(date);

            sc.nextLine();


            System.out.print("Please enter home team name : ");
            name = sc.nextLine();
            FootballClub team1 = null;

            for (FootballClub footballClub : footballClubList) {
                if (footballClub.getName().equals(name))
                    team1 = footballClub;

            }

            System.out.print("Please enter away team name : ");
            name = sc.nextLine();
            FootballClub team2 = null;

            for (FootballClub footballClub : footballClubList) {

                if (footballClub.getName().equals(name))
                    team2 = footballClub;
            }

            System.out.print("Enter home team number of Goals received: ");
            name = sc.nextLine();
            int team1Goals = -1;

            try {
                team1Goals = Integer.parseInt(name);
            } catch (Exception e) {

            }

            if (team1Goals == -1) {
                System.out.print("Home team number of goals received ");
                return;

            }

            System.out.print("Enter away team number Goals received: ");
            name = sc.nextLine();

            int team2Goals = -1;

            try {
                team2Goals = Integer.parseInt(name);

            } catch (Exception e) {

            }

            Match match = new Match();

            match.setHomeTeam(team1);

            match.setAwayTeam(team2);

            match.setHomeTeamScore(team2Goals);

            match.setAwayTeamScore(team1Goals);

            team1.setNoOfGoalsReceived(team1.getNoOfGoalsReceived() + team1Goals);

            team2.setNoOfGoalsReceived(team2.getNoOfGoalsReceived() + team2Goals);

            team1.setNoOfGoalsScored(team1.getNoOfGoalsScored() + team2Goals);

            team2.setNoOfGoalsScored(team2.getNoOfGoalsScored() + team1Goals);

            team1.setNoOfMatches(team1.getNoOfMatches() + 1);

            team2.setNoOfMatches(team2.getNoOfMatches() + 1);

            //if the team 1 wins
            if (team1Goals > team2Goals) {
                team1.setNoOfPoints(team1.getNoOfPoints() + 2);
                team1.setWins(team1.getWins() + 1);
                team2.setDefeats(team2.getDefeats() + 1);
            }
            //if the team 2 wins
            else if (team1Goals < team2Goals) {
                team2.setNoOfPoints(team2.getNoOfPoints() + 2);
                team2.setWins(team2.getWins() + 1);
                team1.setDefeats(team1.getDefeats() + 1);
            }
            //if the match is a draw
            else {
                team1.setNoOfPoints(team1.getNoOfPoints() + 1);
                team2.setNoOfPoints(team2.getNoOfPoints() + 1);
                team1.setDraws(team1.getDraws() + 1);
                team2.setDraws(team2.getDraws() + 1);

            }

            addPlayedMatch.add(date);
            addPlayedMatch.add(match);


            sc.nextLine();
            System.out.println(addPlayedMatch);
            System.out.println("----------------- Played match has been updated successfully! -----------------");






    }

    @Override
    public void Save2(String MatchPlay) throws IOException {
//        System.out.println(addPlayedMatch);
//
//        FileOutputStream fileOutputStream = new FileOutputStream(MatchPlay);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        for (Match matches : addPlayedMatch) {
//            objectOutputStream.writeObject(matches);
//
//        }
//
//        System.out.println("######### Sports clubs have been successfully saved #########");

    }


    public void loadInfo(String MatchPlay) throws IOException {

//        File getData = new File("Match .txt");
//        FileInputStream fileInputStream = new FileInputStream(getData);
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        for (;;) {
//            try {
//                try {
//                    addPlayedMatch.add((Match) objectInputStream.readObject());
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//            } catch (EOFException e) {
//                break;
//            }
//        }
//        System.out.println("######### Sports clubs have been loaded successfully #########");


    }


    @Override
    public void viewTable() {

        //Creating the main window
        Stage stage = new Stage();
        stage.setTitle("Premier League Championship");

        AnchorPane aPane = new AnchorPane();
        aPane.setStyle("-fx-background-color: #1ec49c");
        Label lbl1 = new Label("Premier League");
        lbl1.setStyle("-fx-font-size:25;" + "-fx-font-family: 'Bauhaus 93'");
        lbl1.setLayoutX(45);
        lbl1.setLayoutY(10);
        aPane.getChildren().add(lbl1);

        Button bt1 = new Button("View Tables");
        bt1.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
        bt1.setPrefHeight(57.0);
        bt1.setPrefWidth(296.0);
        bt1.setLayoutX(430.0);
        bt1.setLayoutY(174.0);
        aPane.getChildren().add(bt1);


        bt1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                //descending order of points
                footballClubList.sort(Comparator.comparing(sample.FootballClub::getNoOfPoints).thenComparing(sample.FootballClub::getGoalDifference));
                Collections.reverse(footballClubList);
                // Creating the second window

                Stage stage1 = new Stage();
                stage1.setMaxHeight(700);
                TableView tableV = new TableView();
                tableV.setPrefSize(1100,400);
                tableV.setLayoutY(80);
                tableV.setLayoutX(40);
                tableV.setMaxWidth(800);

                // create buttons
                Button sortGoals= new Button("Sort according to goals scored");
                sortGoals.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: #666b40; -fx-background-radius: 32;-fx-border-color: black; -fx-border-radius: 32;-fx-border-width: 2.1");
                sortGoals.setPrefHeight(50.0);
                sortGoals.setPrefWidth(300.0);

                sortGoals.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        tableV.getItems().clear();
                        footballClubList.sort(Comparator.comparing(sample.FootballClub::getNoOfGoalsScored));
                        Collections.reverse(footballClubList);

                        for (FootballClub footballClub : footballClubList) {
                            tableV.getItems().add(footballClub);
                        }

                    }
                });

                Button sortWins= new Button("Sort according to largest no of wins");
                sortWins.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: #404670; -fx-background-radius: 32;-fx-border-color: black; -fx-border-radius: 32;-fx-border-width: 2.1");
                sortWins.setPrefHeight(50.0);
                sortWins.setPrefWidth(300.0);

                sortWins.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        tableV.getItems().clear();
                        footballClubList.sort(Comparator.comparing(sample.FootballClub::getWins));
                        Collections.reverse(footballClubList);

                        for (FootballClub footballClub : footballClubList) {
                            tableV.getItems().add(footballClub);
                        }
                    }
                });

                Button randomMatch= new Button("Random Match");
                randomMatch.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: #4e9457; -fx-background-radius: 32;-fx-border-color: black; -fx-border-radius: 32;-fx-border-width: 2.1");
                randomMatch.setPrefHeight(50.0);
                randomMatch.setPrefWidth(300.0);

                randomMatch.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        tableV.getItems().clear();

                        Random random = new Random();
                        HashSet<FootballClub> randomSet = new HashSet<>();

                        while (randomSet.size() < 2) {
                            FootballClub randomFootball = footballClubList.get(random.nextInt(footballClubList.size()));
                            randomSet.add(randomFootball);
                            footballClubList.remove(randomFootball);
                        }


                        ArrayList<FootballClub> randomList = new ArrayList<>(randomSet);


                        int maximumGoals=20;
                        int goalsFootball1 = random.nextInt(maximumGoals);
                        int goalsFootball2 = random.nextInt(maximumGoals);


                        FootballClub club1 ;
                        FootballClub club2 ;
                        club1 = randomList.get(0);
                        club2 = randomList.get(1);


                        ((FootballClub) club1).setNoOfMatches(((FootballClub) club1).getNoOfMatches() + 1);
                        ((FootballClub) club2).setNoOfMatches(((FootballClub) club2).getNoOfMatches() + 1);

                        ((FootballClub) club1).setNoOfGoalsScored(((FootballClub) club1).getNoOfGoalsScored() + goalsFootball1);
                        ((FootballClub) club1).setNoOfGoalsReceived(((FootballClub) club1).getNoOfGoalsReceived() + goalsFootball2);

                        ((FootballClub) club2).setNoOfGoalsScored(((FootballClub) club2).getNoOfGoalsScored() + goalsFootball2);
                        ((FootballClub) club2).setNoOfGoalsReceived(((FootballClub) club2).getNoOfGoalsReceived() + goalsFootball1);

                        if(goalsFootball1 > goalsFootball2){
                            System.out.println();
                            System.out.println("Club Name " + club1.getName() + " Scored goals " + goalsFootball1 + " goals" +
                                    "\n" + "Club Name " + club2.getName() + " Scored goals " + goalsFootball2 + " goals" +
                                    "\n" + "Match was won by " +club1.getName() );
                            System.out.println();


                            ((FootballClub) club1).setWins(((FootballClub) club1).getWins() + 1);
                            ((FootballClub) club1).setNoOfPoints(((FootballClub) club1).getNoOfPoints() + 3);

                            ((FootballClub) club2).setDefeats(((FootballClub) club2).getDefeats() + 1);
                        }
                        else if(goalsFootball1 == goalsFootball2) {
                            System.out.println();
                            System.out.println("Club Name " + club1.getName() + " Scored goals " + goalsFootball1 + " goals" +
                                    "\n" + "Club Name " + club2.getName() + " Scored goals " + goalsFootball2 + " goals" +
                                    "\n" + "Match was drawn ");
                            System.out.println();

                            ((FootballClub) club1).setDraws(((FootballClub) club1).getDraws() + 1);
                            ((FootballClub) club1).setNoOfPoints(((FootballClub) club1).getNoOfPoints() + 1);

                            ((FootballClub) club2).setDraws(((FootballClub) club2).getDraws() + 1);
                            ((FootballClub) club2).setNoOfPoints(((FootballClub) club2).getNoOfPoints() + 1);
                        }
                        else {
                            System.out.println();
                            System.out.println("Club Name " + club1.getName() + " Scored goals " + goalsFootball1 + " goals" +
                                    "\n" + "Club Name " + club2.getName() + " Scored goals " + goalsFootball2 + " goals" +
                                    "\n" + "Match was won by " +club2.getName() );
                            System.out.println();
                            ((FootballClub) club2).setWins(((FootballClub) club2).getWins() + 1);
                            ((FootballClub) club2).setNoOfPoints(((FootballClub) club2).getNoOfPoints() + 3);

                            ((FootballClub) club1).setDefeats(((FootballClub) club1).getDefeats() + 1);
                        }

                        footballClubList.add(club1);
                        footballClubList.add(club2);


                        Comparator clubComparator = (Comparator.comparing(sample.FootballClub::getNoOfPoints).thenComparing(sample.FootballClub::getNoOfGoalsScored));
                        Collections.sort(footballClubList,clubComparator);
                        Collections.reverse(footballClubList);

                        for (FootballClub footballClub : footballClubList) {
                            tableV.getItems().add(footballClub);
                        }

                    }


                });

                //creating table columns for the first table
                TableColumn column1 = new TableColumn("Club ID");
                column1.setCellValueFactory(new PropertyValueFactory<>("sportsClubId"));
                column1.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");

                TableColumn column2 = new TableColumn("Name");
                column2.setCellValueFactory(new PropertyValueFactory<>("name"));
                column2.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");

                TableColumn column3 = new TableColumn("Wins");
                column3.setCellValueFactory(new PropertyValueFactory<>("wins"));
                column3.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");

                TableColumn column4 = new TableColumn("Draws");
                column4.setCellValueFactory(new PropertyValueFactory<>("draws"));
                column4.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");

                TableColumn column5 = new TableColumn("Defeats");
                column5.setCellValueFactory(new PropertyValueFactory<>("defeats"));
                column5.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");

                TableColumn column6 = new TableColumn("Goals Received");
                column6.setCellValueFactory(new PropertyValueFactory<>("noOfGoalsReceived"));
                column6.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");

                TableColumn column7 = new TableColumn("Goals Scored");
                column7.setCellValueFactory(new PropertyValueFactory<>("noOfGoalsScored"));
                column7.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
                column7.setPrefWidth(300);

                TableColumn column8 = new TableColumn("Points");
                column8.setCellValueFactory(new PropertyValueFactory<>("noOfPoints"));
                column8.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
                column8.setPrefWidth(140);


                //adding columns to the first table view
                tableV.getColumns().addAll(column1, column2, column3, column4, column5, column6, column7, column8);
                tableV.setStyle("-fx-background-color: #eee8aa");
                for (FootballClub footballClub : footballClubList) {
                    tableV.getItems().add(footballClub);
                }

                TableView tableV2 = new TableView();
                tableV2.setLayoutX(40);
                tableV2.setLayoutY(550);
                tableV2.setPrefSize(900,400);
                tableV2.setMaxWidth(800);

                //creating table columns for the second table
                TableColumn table2C1 = new TableColumn("Home Team");
                table2C1.setCellValueFactory(new PropertyValueFactory<>("homeTeam"));
                table2C1.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
                table2C1.setPrefWidth(159);

                TableColumn table2C2 = new TableColumn("Away Team");
                table2C2.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));
                table2C2.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
                table2C2.setPrefWidth(159);

                TableColumn table2C3 = new TableColumn("Home Team Score");
                table2C3.setCellValueFactory(new PropertyValueFactory<>("homeTeamScore"));
                table2C3.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
                table2C3.setPrefWidth(159);

                TableColumn table2C4 = new TableColumn("Away Team Score");
                table2C4.setCellValueFactory(new PropertyValueFactory<>("awayTeamScore"));
                table2C4.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
                table2C4.setPrefWidth(159);

                TableColumn table2C5 = new TableColumn("Date");
                table2C5.setCellValueFactory(new PropertyValueFactory<>("date"));
                table2C5.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
                table2C5.setPrefWidth(164);
//
//                TableColumn table2C6 = new TableColumn("Month");
//                table2C6.setCellValueFactory(new PropertyValueFactory<>("month"));
//                table2C6.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
//                table2C6.setPrefWidth(100);
//
//                TableColumn table2C7 = new TableColumn("Year");
//                table2C7.setCellValueFactory(new PropertyValueFactory<>("year"));
//                table2C7.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
//                table2C7.setPrefWidth(100);



                //adding columns to the second table view
                tableV2.getColumns().addAll(table2C1,table2C2,table2C3,table2C4,table2C5);
                for (Match matches : addPlayedMatch) {
                    tableV2.getItems().add(matches);
                }

                HBox hBox=new HBox();
                hBox.getChildren().addAll(sortGoals,sortWins,randomMatch);

                //creating text field to search data
                TextField searchTxt = new TextField();
                searchTxt.setPromptText("Search");
                searchTxt.setMinWidth(200);
                searchTxt.setLayoutX(150);
                searchTxt.setLayoutY(80);

                searchTxt.setMaxWidth(column2.getPrefWidth());

                //creating search button to search data
                Button searchButton = new Button("Search");
                searchButton.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: #41d0b1;-fx-background-radius: 21");
                searchButton.setMinWidth(100.0);
                searchButton.setPrefHeight(20.0);
                searchButton.setLayoutX(285);
                searchButton.setLayoutY(80);

                hBox.getChildren().addAll(searchTxt, searchButton);
                hBox.setSpacing(4);

                VBox vBox = new VBox(tableV,tableV2,hBox);
                vBox.setPadding(new Insets(60, 50, 60, 50));
                vBox.setPrefHeight(600);

                Scene scene = new Scene(vBox);

                stage1.setScene(scene);
                stage1.showAndWait();
            }


        });

        Scene scene = new Scene(aPane, 900, 450);
        stage.setScene(scene);
        stage.showAndWait();
    }




//
//            File PremierLeague = new File("Premier League.txt");
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(PremierLeague);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        ObjectInputStream objectInputStream = null;
//        try {
//            objectInputStream = new ObjectInputStream(fileInputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Object footballClubArray = null;
//        try {
//            footballClubArray = objectInputStream.readObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Object matchArray = null;
//        try {
//            matchArray = objectInputStream.readObject();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        footballClubList = (List<FootballClub>) footballClubArray;
//            addPlayedMatch = (List<Match>) matchArray;
//
//            return  footballClubList;


//
//    @Override
//        public void viewTable() {
//
////        Stage stage=new Stage();
////        stage.setTitle("Premier League Championship");
////
////        AnchorPane aPane =new AnchorPane();
////        aPane.setStyle("-fx-background-color: #1ec49c");
////        Label lbl1=new Label("Premier League");
////        lbl1.setStyle("-fx-font-size:25;"+ "-fx-font-family: 'Bauhaus 93'");
////        lbl1.setLayoutX(45);
////        lbl1.setLayoutY(10);
////        aPane.getChildren().add(lbl1);
////
////        Button bt1=new Button("View Table");
////        bt1.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
////        bt1.setPrefHeight(57.0);
////        bt1.setPrefWidth(296.0);
////        bt1.setLayoutX(430.0);
////        bt1.setLayoutY(74.0);
////        aPane.getChildren().add(bt1);
////
////
////
////        bt1.setOnAction(new EventHandler<ActionEvent>(){
////
////            @Override
////            public void handle(ActionEvent event) {
////                Stage stage1=new Stage();
////                TableView tableV=new TableView();
////                tableV.setMaxWidth(800);
////
////                TableColumn column1=new TableColumn("Club ID");
////                column1.setCellValueFactory(new PropertyValueFactory<>("sportsClubId"));
////                column1.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////
////                TableColumn column2=new TableColumn("Name");
////                column2.setCellValueFactory(new PropertyValueFactory<>("name"));
////                column2.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////
////                TableColumn column3=new TableColumn("Wins");
////                column3.setCellValueFactory(new PropertyValueFactory<>("wins"));
////                column3.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////
////                TableColumn column4=new TableColumn("Draws");
////                column4.setCellValueFactory(new PropertyValueFactory<>("draws"));
////                column4.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////
////                TableColumn column5=new TableColumn("Defeats");
////                column5.setCellValueFactory(new PropertyValueFactory<>("defeats"));
////                column5.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////
////                TableColumn column6=new TableColumn("Goals Received");
////                column6.setCellValueFactory(new PropertyValueFactory<>("noOfGoalsReceived"));
////                column6.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////
////                TableColumn column7=new TableColumn("Goals Scored");
////                column7.setCellValueFactory(new PropertyValueFactory<>("noOfGoalsScored"));
////                column7.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////                column7.setPrefWidth(300);
////
////
////                TableColumn column8=new TableColumn("Points");
////                column8.setCellValueFactory(new PropertyValueFactory<>("noOfPoints"));
////                column8.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
////                column8.setPrefWidth(140);
////
////
////                tableV.getColumns().addAll(column1,column2,column3,column4,column5,column6,column7,column8);
////
////
////                tableV.setStyle("-fx-background-color: #eee8aa");
////
////                for (FootballClub footballClub : footballClubList) {
////                    tableV.getItems().add(footballClub);
////                }
////
////                VBox vBox=new VBox(tableV);
////                Scene scene=new Scene(vBox);
////
////                stage1.setScene(scene);
////                stage1.showAndWait();
////            }
////
////
////        });
////
////        Scene scene=new Scene(aPane,900,450);
////        stage.setScene(scene);
////        stage.showAndWait();
//        Application.launch(GUI.class);
//    }





    @Override
    public void quit() {
        System.out.println("\n Program will quit now.");
        System.out.println(".........................");
        System.exit(0);

    }
}







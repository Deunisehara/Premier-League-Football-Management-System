package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {

//    public static void main(String[] args) throws IOException, ClassNotFoundException {



//    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        PremierLeagueManager premierLeagueManager=new PremierLeagueManager();
        Scanner scanner = new Scanner(System.in);
        boolean val = true;


        premierLeagueManager.retrieveData("Premier League.txt");
//        premierLeagueManager.retrieveData("Match.txt");

        System.out.println("Premier league championship");


//giving the user to choose an option
        do{
            System.out.println("\n------------------Select an option-------------------");
            System.out.println("\n a - Add \n d - Delete " +
                    " \n s - Display the various statistics for a selected club \n v - View Table  \n p - Add a played match \n w - Write/Save in a file \n t - View GUI \n q - Quit the program ");

            System.out.println("################## Enter an option #######################");
            String insert = scanner.nextLine().toLowerCase();


//creating a switch

            switch (insert) {
                case "a":
                    premierLeagueManager.Add(insert);
                    break;
                case "d":
                    premierLeagueManager.Delete();
                    break;
                case "s":
                    System.out.println("Enter club name");
                    Scanner sc = new Scanner(System.in);
                    String name = sc.nextLine();
                    premierLeagueManager.DisplayStat();
                    break;

                case "v":
                    premierLeagueManager.DisplayPremierLeagueTable();
                    break;

                case "p":
                    premierLeagueManager.AddPlayedMatch();
                    break;

                case "w":
                    try {
                        premierLeagueManager.Save("Premier League.txt");
//                        premierLeagueManager.Save2("Match.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case "t":
                    premierLeagueManager.viewTable();
//                    Application.launch(GUI.class);
                    break;

                case "q":
                    premierLeagueManager.quit();


                default:
                    System.out.println("Invalid Input. Please try again.");
            }
        }
        while(val);
    }
}


//package sample;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//
//public class GUI extends Application{
//
//
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//        //Creating the main window
//        Stage stage = new Stage();
//        stage.setTitle("Premier League Championship");
//
//        AnchorPane aPane = new AnchorPane();
//        aPane.setStyle("-fx-background-color: #1ec49c");
//        Label lbl1 = new Label("Premier League");
//        lbl1.setStyle("-fx-font-size:25;" + "-fx-font-family: 'Bauhaus 93'");
//        lbl1.setLayoutX(45);
//        lbl1.setLayoutY(10);
//        aPane.getChildren().add(lbl1);
//
//        Button bt1 = new Button("View Table");
//        bt1.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
//        bt1.setPrefHeight(57.0);
//        bt1.setPrefWidth(296.0);
//        bt1.setLayoutX(430.0);
//        bt1.setLayoutY(174.0);
//        aPane.getChildren().add(bt1);
//
//
//        bt1.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//
//                PremierLeagueManager premierLeagueManager=new PremierLeagueManager();
//                List<FootballClub> footballClubList=premierLeagueManager.getArray();
//
//                footballClubList.sort(Comparator.comparing(sample.FootballClub::getNoOfPoints).thenComparing(sample.FootballClub::getGoalDifference));
//                Collections.reverse(footballClubList);
//                // Creating the second window
//
//                Stage stage1 = new Stage();
//                stage1.setMaxHeight(700);
//                TableView tableV = new TableView();
//                tableV.setPrefSize(1100,400);
//                tableV.setLayoutY(80);
//                tableV.setLayoutX(40);
//                tableV.setMaxWidth(800);
//
//                // create buttons
//                Button sortGoals= new Button("Sort according to goals scored");
//                sortGoals.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: #666b40; -fx-background-radius: 32");
//                sortGoals.setPrefHeight(50.0);
//                sortGoals.setPrefWidth(300.0);
//
//                Button sortWins= new Button("Sort according to largest no of wins");
//                sortWins.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: #404670; -fx-background-radius: 32");
//                sortWins.setPrefHeight(50.0);
//                sortWins.setPrefWidth(300.0);
//
//                Button randomMatch= new Button("Random Match");
//                randomMatch.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: #4e9457; -fx-background-radius: 32");
//                randomMatch.setPrefHeight(50.0);
//                randomMatch.setPrefWidth(300.0);
//
//                //creating table columns for the first table
//                TableColumn column1 = new TableColumn("Club ID");
//                column1.setCellValueFactory(new PropertyValueFactory<>("sportsClubId"));
//                column1.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//
//                TableColumn column2 = new TableColumn("Name");
//                column2.setCellValueFactory(new PropertyValueFactory<>("name"));
//                column2.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//
//                TableColumn column3 = new TableColumn("Wins");
//                column3.setCellValueFactory(new PropertyValueFactory<>("wins"));
//                column3.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//
//                TableColumn column4 = new TableColumn("Draws");
//                column4.setCellValueFactory(new PropertyValueFactory<>("draws"));
//                column4.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//
//                TableColumn column5 = new TableColumn("Defeats");
//                column5.setCellValueFactory(new PropertyValueFactory<>("defeats"));
//                column5.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//
//                TableColumn column6 = new TableColumn("Goals Received");
//                column6.setCellValueFactory(new PropertyValueFactory<>("noOfGoalsReceived"));
//                column6.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//
//                TableColumn column7 = new TableColumn("Goals Scored");
//                column7.setCellValueFactory(new PropertyValueFactory<>("noOfGoalsScored"));
//                column7.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//                column7.setPrefWidth(300);
//
//                TableColumn column8 = new TableColumn("Points");
//                column8.setCellValueFactory(new PropertyValueFactory<>("noOfPoints"));
//                column8.setStyle("-fx-background-color:  azure;-fx-font-weight: bold");
//                column8.setPrefWidth(140);
//
//                try {
//                    tableV.setItems(displayTable1());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                //adding columns to the first table view
//                tableV.getColumns().addAll(column1, column2, column3, column4, column5, column6, column7, column8);
//
//
//                tableV.setStyle("-fx-background-color: #eee8aa");
//
//                TableView tableV2 = new TableView();
//                tableV2.setLayoutX(40);
//                tableV2.setLayoutY(550);
//                tableV2.setPrefSize(1100,400);
//                tableV2.setMaxWidth(800);
//
//                //creating table columns for the second table
//                TableColumn table2C1 = new TableColumn("Home Team");
//                table2C1.setCellValueFactory(new PropertyValueFactory<>("homeTeam "));
//                table2C1.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
//                table2C1.setPrefWidth(159);
//
//                TableColumn table2C2 = new TableColumn("Away Team");
//                table2C2.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));
//                table2C2.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
//                table2C2.setPrefWidth(159);
//
//                TableColumn table2C3 = new TableColumn("Home Team Score");
//                table2C3.setCellValueFactory(new PropertyValueFactory<>("firstGoalCount"));
//                table2C3.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
//                table2C3.setPrefWidth(159);
//
//                TableColumn table2C4 = new TableColumn("Away Team Score");
//                table2C4.setCellValueFactory(new PropertyValueFactory<>("secondGoalCount"));
//                table2C4.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
//                table2C4.setPrefWidth(159);
//
//                TableColumn table2C5 = new TableColumn("Date");
//                table2C5.setCellValueFactory(new PropertyValueFactory<>("date"));
//                table2C5.setStyle("-fx-background-color:  #d0dd7a;-fx-font-weight: bold");
//                table2C5.setPrefWidth(164);
//
//                //adding columns to the second table view
//                tableV2.getColumns().addAll(table2C1,table2C2,table2C3,table2C4,table2C5);
//                try {
//                    tableV2.setItems(displayTable2());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//                HBox hBox=new HBox();
//                hBox.getChildren().addAll(sortGoals,sortWins,randomMatch);
//
//                //creating text field to search data
//                TextField searchTxt = new TextField();
//                searchTxt.setPromptText("Search");
//                searchTxt.setMinWidth(200);
//                searchTxt.setLayoutX(150);
//                searchTxt.setLayoutY(80);
//
//                searchTxt.setMaxWidth(column2.getPrefWidth());
//
//                //creating search button to search data
//                Button searchButton = new Button("Search");
//                searchButton.setMinWidth(200);
//                searchButton.setLayoutX(285);
//                searchButton.setLayoutY(80);
//
//                hBox.getChildren().addAll(searchTxt, searchButton);
//                hBox.setSpacing(4);
//
//                VBox vBox = new VBox(tableV,tableV2,hBox);
//                vBox.setPadding(new Insets(60, 50, 60, 50));
//                vBox.setPrefHeight(600);
//
//                Scene scene = new Scene(vBox);
//
//                stage1.setScene(scene);
//                stage1.show();
//            }
//
//
//        });
//
//        Scene scene = new Scene(aPane, 900, 450);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//
//    public static ObservableList<FootballClub> displayTable1() throws IOException, ClassNotFoundException {
//        PremierLeagueManager premierLeagueManager = new PremierLeagueManager();
//        premierLeagueManager.retrieveData("Premier League.txt");
//        ObservableList<FootballClub> observableList = FXCollections.observableArrayList();
//        for (FootballClub footballClub : premierLeagueManager.getArray()) {
//
//            observableList.addAll(footballClub);
//
//        }
//
//        return observableList;
//    }
//
//    public static ObservableList<FootballClub>sort1(){
//        PremierLeagueManager premierLeagueManager = new PremierLeagueManager();
//        ObservableList<FootballClub> observableList = FXCollections.observableArrayList();
//        for (FootballClub footballClub : premierLeagueManager.getArray()) {
//            premierLeagueManager.getArray().sort(Comparator.comparing(sample.FootballClub::getNoOfPoints).thenComparing(sample.FootballClub::getGoalDifference));
//            Collections.reverse( premierLeagueManager.getArray());
//
//
//
//        }
//
//        return observableList;
//
//    }
//
//    public static ObservableList<Match> displayTable2() throws IOException, ClassNotFoundException {
//        PremierLeagueManager premierLeagueManager = new PremierLeagueManager();
//        premierLeagueManager.retrieveData("Premier League.txt");
//        ObservableList<Match> observableList = FXCollections.observableArrayList();
//        for (Match match : premierLeagueManager.getMatchArray()) {
//
//            observableList.addAll(match);
//
//        }
//
//        return observableList;
//    }
//
//    public static void main(String args[]){
//        launch(args);
//
//    }
//
//}
//
//

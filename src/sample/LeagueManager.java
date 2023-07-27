package sample;

import java.io.IOException;
import java.util.List;

public interface LeagueManager {

    void Add (String insert);
    void Delete();
    void DisplayStat();
    void DisplayPremierLeagueTable();
    void Save(String PremierLeague) throws IOException;
    void retrieveData(String PremierLeague) throws IOException, ClassNotFoundException;
    void AddPlayedMatch();
    void Save2(String MatchPlay) throws IOException;
    void loadInfo(String MatchPlay) throws IOException;

    void viewTable();

    void quit ();



}

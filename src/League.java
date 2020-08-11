import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>   {
    private String name;
    private ArrayList<T> leagueBoard = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }
    public boolean addTeam(T team){
        if (team != null){
            leagueBoard.add(team);
            System.out.println(team.getName() + " added to the " + this.name +  " board!");
            return true;
        }
        System.out.println("Invalid data");
        return false;
    }
    public void showLeagueBoard() {
        Collections.sort(leagueBoard);
        for (T t : leagueBoard){
            System.out.println(t.getName());
        }
    }
}


public class Main {
    public static void main(String[] args) {

        League<FootballTeam> worldcup = new League<>("Worldcup");
        FootballTeam england = new FootballTeam("England", 7);
        FootballTeam spain = new FootballTeam("Spain", 10);
        FootballTeam italy = new FootballTeam("Italy", 12);
        FootballTeam poland = new FootballTeam("Poland", 6);
        FootballTeam latvia = new FootballTeam("Latvia", 4);
        worldcup.addTeam(england);
        worldcup.addTeam(spain);
        worldcup.addTeam(italy);
        worldcup.addTeam(poland);
        worldcup.addTeam(latvia);

        worldcup.showLeagueBoard();

        /*League<BaseballTeam> americaBaseball = new League<>("America Baseball Championship");
        BaseballTeam australiaB = new BaseballTeam("Australia", 5);
        americaBaseball.addTeam(australiaB); */

    }
}

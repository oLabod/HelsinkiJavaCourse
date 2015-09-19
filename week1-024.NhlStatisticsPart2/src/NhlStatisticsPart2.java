
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                        System.out.println("Top ten by points");
                        NHLStatistics.sortByPoints();
                        NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                        System.out.println("Top ten by goals");
                        NHLStatistics.sortByGoals();
                        NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                        System.out.println("Top ten by assists");
                        NHLStatistics.sortByAssists();
                        NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                        System.out.println("Top ten by penalties");
                        NHLStatistics.sortByPenalties();
                        NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.println("Which player? ");
                String name = reader.nextLine();
                NHLStatistics.searchByPlayer(name);  
            } else if (command.equals("club")) {
                System.out.println("Which club?: ");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();     // orders the players by points
                NHLStatistics.teamStatistics(club);
            }

        }
    }
}

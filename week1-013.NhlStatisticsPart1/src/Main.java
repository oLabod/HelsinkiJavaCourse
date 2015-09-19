import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        
        System.out.println("Top twenty-five by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        
        System.out.println("Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        
        System.out.println("Anaheim Ducks by Points");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
          
    }
}

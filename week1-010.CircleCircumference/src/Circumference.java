
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

       System.out.print("Type the radius: "); // Program your solution here 
       int radius1 = Integer.parseInt(reader.nextLine());
       
       double solution = 2 * Math.PI * radius1; 
       
        System.out.println("Circumference of the circle: " + solution);
    }
}

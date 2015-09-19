
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    System.out.print("Type a number: ");    // Implement your program here. Remember to ask the input from user
 
    int number11 = Integer.parseInt(reader.nextLine());
    
    System.out.print("Type another number: ");
   
     int number22 = Integer.parseInt(reader.nextLine());
     
    double solution =  number11 / (number22 * 1.0);
    
    System.out.println("\nDivision: " + number11 + " / " + number22 + " = " + solution);   // Implement your program here. Remember to ask the input from user.
    }
}

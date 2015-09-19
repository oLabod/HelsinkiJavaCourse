
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    System.out.print("Type a number: ");    // Implement your program here. Remember to ask the input from user
 
      int number11 = Integer.parseInt(reader.nextLine());
    
    System.out.print("Type another number: ");
   
     int number22 = Integer.parseInt(reader.nextLine());
     
    int solution = number11 + number22;
    
    System.out.println("Sum of the numbers:" + solution);
    
    }
}


import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");    // Implement your program here. Remember to ask the input from user
        int number1 = Integer.parseInt(reader.nextLine());    // Type your program here:
        
        
        if (number1 > 0)
        { 
            System.out.println("The number is positive.");   
        }
        else
        {
            System.out.println("The number is not positive.");  
        }
    
    
    
    
    }
}


import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
 System.out.print(" How old are you?  ");
 int number1 = Integer.parseInt(reader.nextLine());
 
         if (number1 >= 0 && number1 <=120)
        { 
            System.out.println("OK");   
        }
         else {
    System.out.println("Impossible!");
         
}
    }
}

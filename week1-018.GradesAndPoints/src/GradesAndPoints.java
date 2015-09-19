
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
 System.out.print(" Type the points [0-60]:  ");
 int number1 = Integer.parseInt(reader.nextLine());
 
        if (number1 <= 29)
        { 
            System.out.println("Grade: failed");   
        }
         
        if (number1 <= 34)
            if (number1 >= 30)
        { 
            System.out.println("Grade: 1");   
        }
        
        if (number1 <= 39)
            if (number1 >= 35)
        { 
            System.out.println("Grade: 2");   
        }
                
                
                
         if (number1 <= 44)
            if (number1 >= 40)
        { 
            System.out.println("Grade: 3");   
        }
                        
        if (number1 <= 49)
            if (number1 >= 45)
        { 
            System.out.println("Grade: 4");   
        }
        
       if (number1 <= 60)
            if (number1 >= 50)
        { 
            System.out.println("Grade: 5");   
        }
                                
                              
    }
}

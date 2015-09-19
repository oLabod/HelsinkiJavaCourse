
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
           while (true) {
                System.out.print("Type the temperature: ");
                double number1 = Double.parseDouble(reader.nextLine());
              
                if ((number1 >= -30) && (number1 <=40)) {
                    Graph.addNumber(number1);
                }
        // Graph is used as follows:
        //Graph.addNumber(number1);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
}
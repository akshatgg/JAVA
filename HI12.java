import java.util.*;
import java.text.*;

public class HI12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String str = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
String india = NumberFormat.getCurrencyInstance(new Locale("EN","IN")).format(payment);
String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        // Write your code here.
        
        System.out.println("US: " + str);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

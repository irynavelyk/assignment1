import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = myScanner.nextLine(); 
        
        System.out.println("hourlyRate:");
        String hourlyRate = myScanner.nextLine(); 
        
        System.out.println("Hours:");
        String hours = myScanner.nextLine(); 

        int intHours = Integer.parseInt(hours);
        int intHourlyRate = Integer.parseInt(hourlyRate);

        PaymentSlip p1 = new PaymentSlip(name, intHourlyRate, intHours);
        p1.printPayment();


         
    }
}

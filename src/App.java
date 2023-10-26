import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = myScanner.nextLine(); 
        
        System.out.println("hourlyRate:");
        int hourlyRate = myScanner.nextInt(); 
        
        System.out.println("Hours:");
        int hours = myScanner.nextInt(); 


        PaymentSlip p1 = new PaymentSlip(name, hourlyRate, hourlyRate);

        System.out.println("--------------------");
        System.out.println("## PAYMENT INFORMATION ##");
        System.out.println("Name: \t\t" + p1.getName());
        System.out.println("Hourly rate: \t$" + p1.getHourlyRate());
        System.out.println("Hours: \t" + p1.getHours() +"\n");

        System.out.println("Salary: \t$"  + p1.calculateSalary());
        System.out.println("Net Salary: \t$" + p1.calculateNetSalary());
        System.out.println("If you have any questions regarding your salary, contact Bob: \n--------------------");
    }
   


         
    }

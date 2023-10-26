public class PaymentSlip {
    private String name;
    private int hourlyRate;
    private int hours;


    public PaymentSlip (String name, int hourlyRate, int hours){
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours; 
    }

    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name=name; 
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate (int hourlyRate){
        this.hourlyRate=hourlyRate; 
    }
      public int getHours(){
        return hours;
    }
    public void setHours (int hours){
        this.hours=hours; 
    }
    public int calculateSalary (){
        return hourlyRate * hours; 
    }
    public double calculateNetSalary (){
        return calculateSalary() * 0.7; 
    }
    public void printPayment (){
        System.out.println("--------------------");
        System.out.println("## PAYMENT INFORMATION ##");
        System.out.println("Name: \t\t" + name);
        System.out.println("Hourly rate: \t$" + hourlyRate);
        System.out.println("Hourly rate: \t" + hours +"\n");

        System.out.println("Salary: \t$"  + calculateSalary());
        System.out.println("Net Salary: \t$" + calculateNetSalary());
        System.out.println("If you have any questions regarding your salary, contact Bob: \n--------------------");
    }
   


}

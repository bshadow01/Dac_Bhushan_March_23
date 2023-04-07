import java.util.*;

class ElectricityBill{
   private String customerName;
   private double unitsConsumed;
   private double billAmount;

    // getter unitsConsumed

    ElectricityBill(String customerName , double unitsConsumed  ){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;

    }

    

    public String getcustomerName(){
        return customerName;

    }

    public double getunitsConsumed(){
        return unitsConsumed;
    }

    public double getbillAmount(){
        return billAmount;
    }

    public void calculateBillAmount(){
        if(unitsConsumed <=100){
            billAmount = unitsConsumed*5;
        } 
        else if(unitsConsumed>100 && unitsConsumed<200){
            billAmount = unitsConsumed*7;
        }
        else{
            billAmount = unitsConsumed*10;
        }

    }
} 

public class Assig4ElectricitBilCalculation {
    public static void main(String args[]){

        System.out.println("Welcome Electricit Bil Calculation System.....!!!!");
        System.out.println("__________________________________________________");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name :-> ");
        String customerName = sc.nextLine();
        System.out.print("Enter Units Consumed :-> ");
        double unitsConsumed = sc.nextDouble();
        ElectricityBill bill1 = new ElectricityBill(customerName ,unitsConsumed);
        bill1.calculateBillAmount();
        
        System.out.println("Customer Name :-> "+ bill1.getcustomerName() );
        System.out.println("Units Consumed :-> "+bill1.getunitsConsumed());
        System.out.println("Bill Amount :-> "+bill1.getbillAmount());

    }

    
}

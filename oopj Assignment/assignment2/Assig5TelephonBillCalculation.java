import java.util.*;

class TelephoneBill{
    private String customeName;
    private String phoneNumber;
    private int numberOfCalls;
    private float durationOfCalls;


    //Setters
    public void setCustomeName(String customeName){
        this.customeName = customeName;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setNumberOfCalls(int numberOfCalls){
        this.numberOfCalls = numberOfCalls;
    }

    public void setDurationOfCalls(float durationOfCalls){
        this.durationOfCalls = durationOfCalls;
    }
    //getters
    public String getCustomeName(){
        return customeName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getNumberOfCalls(){
        return numberOfCalls;
    }
    public float getDurationOfCalls(){
        return durationOfCalls;
    }

 


    public void Duration(){
        if(this.durationOfCalls<1){
            this.durationOfCalls = 1;
        }
    }
    
    public double CallCharges(){
        if(numberOfCalls <= 100){
        
        return numberOfCalls*50;
        }
        else{
            return numberOfCalls*25;
        }
    }
        
    public void check(double charge ){
        if(charge > 1000){
            System.out.println("You crossed your monthly limit $10 :-> "+ charge/100 );
        }
        else{
            System.out.println("Your Telephone Bill :-> "+ charge/100);
        }
    }

     }

     

public class Assig5TelephonBillCalculation {
    public static void main(String args[]){
        

        System.out.println("Welcome Telephon Bill Calculation System.....!!!!");
        System.out.println("__________________________________________________");
        System.out.println();

        TelephoneBill ebill = new TelephoneBill();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Custome Name  : ");
        ebill.setCustomeName(sc.nextLine());
        System.out.print("Enter Phone Number  : ");
        ebill.setPhoneNumber(sc.nextLine());
        System.out.print("Enter Number Of Calls  : ");
        ebill.setNumberOfCalls(sc.nextInt());
        System.out.print("Enter Duration Of Calls  : ");
        ebill.setDurationOfCalls(sc.nextFloat());


        ebill.Duration();

        System.out.println("__________________________________________________");
        System.out.println();
        System.out.println("Custome Name  :-> "+ebill.getCustomeName());
        System.out.println("Phone Number :-> "+ebill.getPhoneNumber());
        System.out.println("Number Of Calls :-> "+ebill.getNumberOfCalls());
        System.out.println("Duration Of Calls :-> "+ebill.getDurationOfCalls());
        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println();

        double charge = ebill.CallCharges();
        ebill.check(charge);
    

    }
    
    
}

import java.util.*;

class Credit{
    private int creditHistory;
    private double creditUtilization ;
    private boolean paymentHistory;

    Credit(){

    }

    public void setcreditHistory(int creditHistory ){
        this.creditHistory = creditHistory;

    }
    public void setcreditUtilization(double creditUtilization ){
        this.creditUtilization = creditUtilization;

    }
    public void setpaymentHistory(boolean paymentHistory){
        this.paymentHistory = paymentHistory;

    }
    public int getcreditHistory(){
        
        return this.creditHistory;
    }
    public double getcreditUtilization(){

        return this.creditUtilization;

    }
    public boolean getpaymentHistory(){

        return this.paymentHistory;

    }

}



public class CreditScoreCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Credit credit1 = new Credit();
        System.out.println("Enter creditHistory :-> ");
        credit1.setcreditHistory(sc.nextInt());
        System.out.println("Enter credit Utilization :-> ");
        credit1.setcreditUtilization(sc.nextDouble());
        System.out.println("Enter creditHistory :-> ");
        credit1.setpaymentHistory(sc.nextBoolean());


        System.out.println(credit1.getcreditHistory());
        System.out.println(credit1.getcreditUtilization());
        System.out.println(credit1.getpaymentHistory());

 
    }
    
}

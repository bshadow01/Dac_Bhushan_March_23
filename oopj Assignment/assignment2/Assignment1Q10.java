import java.util.Scanner;

class CreditScoreCalci{
    int creditHistory;
    double creditUtilization;
    boolean paymentHistory;
    double creditScore;

    CreditScoreCalci(int creditHistory, double creditUtilization,boolean paymentHistory){
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    public void setCreditHistory(int creditHistory){
        this.creditHistory = creditHistory;
    }
    public void setCreditHistory(double creditUtilization){
        this.creditUtilization = creditUtilization;
    }
    public void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory = paymentHistory;
    }
    public void setCreditScore(double creditScore){
       this.creditScore = creditScore;
     }
    public int getCreditHistory(){
        return this.creditHistory;
    }
    public double getCreditUtilization(){
       return this.creditUtilization;
    }
    public boolean getPaymentHistory(){
       return this.paymentHistory;
    }
    
    public double calculateCreditScore(){
        if(this.paymentHistory == true){
         this.creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 55;
           return this.creditScore; 
        }
     
          this.creditScore = (this.creditHistory * 15) + (int)(creditUtilization * 30) + 35;
           return this.creditScore; 
        
     }
    
}


public class Assignment1Q10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Credit History :");
        int creditHistory = sc.nextInt();
        System.out.println("Credit Utilization :");
        double creditUtilization = sc.nextDouble();
         System.out.println("Credit History :");
        boolean paymentHistory = sc.nextBoolean();

        CreditScoreCalci credit = new CreditScoreCalci(creditHistory,creditUtilization,paymentHistory);
         
        double creditScore = credit.calculateCreditScore();
        System.out.println("Credit Score : "+creditScore);
    }
}
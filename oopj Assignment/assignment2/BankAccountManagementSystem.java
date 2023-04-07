import java .util.*;

class BankAccount{
    String name;
    int accountNumber;
    double accountBalance;

    Scanner sc = new Scanner(System.in);

    BankAccount(String name ){
        Random rand = new Random();
        this.accountNumber = rand.nextInt(1000000000);
        this.name = name;
        this.accountBalance = 0;


    }

    public String getName(){
        return name; 
    }

    public int getAccountNumber(){
        return accountNumber; 
    }

    public double getAccountBalance(){
        return accountBalance; 
    }

    public void Deposit(){
        System.out.print("Enter the Amount to Deposit :-> ");
        double Amount = sc.nextDouble();
        this.accountBalance = accountBalance + Amount;
        
    }

    public void Withdraw(){
        System.out.print("Enter the Amount to Withdraw :-> ");
        double Amount = sc.nextDouble();
        this.accountBalance = accountBalance - Amount;

    }

    public void DisplayBalance(){
        System.out.println("Your Account Balance :-> "+accountBalance);


    }

    public void DisplayInformation(){
        getName();
        getAccountNumber();
        getAccountBalance();
    }

    public int menuList (){
        System.out.println("__________________________________________________");
        System.out.println("1 -> Deposit");
        System.out.println("2 -> Withdraw");
        System.out.println("3 -> Display Information");
        System.out.println("4 -> Display Balance");
        System.out.println("5 -> Exit ");
        System.out.print("Enter your choice :-> ");
        return sc.nextInt();
    }

}

public class BankAccountManagementSystem {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println();
        System.out.println("Welcome Bank Account Management System.....!!!!");
        System.out.println("__________________________________________________");
        System.out.println();
        System.out.print("Enter Your Name to Create new Account :-> ");
        String name = sc.nextLine();
        BankAccount newAc = new BankAccount(name);

        System.out.println("__________________________________________________");
        System.out.println();
        System.out.println("Customer Name :-> "+newAc.getName());
        System.out.println("Account Number :-> "+newAc.getAccountNumber());
        System.out.println("Account Balance :-> "+newAc.getAccountBalance());

        System.out.println("__________________________________________________");
        System.out.println("Note:-> Use this account number for future transaction :-> " + newAc.getAccountNumber());
        System.out.println();

        
        System.out.println("__________________________________________________");
        int choice;
        System.out.print("Enter Yout account number to Verification :-> ");
        int accNum = sc.nextInt();
        if(accNum==newAc.accountNumber){
            while( ( choice = newAc.menuList( ) ) != 5 ){ 
                try{      
                switch( choice ){
                    case 1:
                        newAc.Deposit();
                        break;
                    case 2:
                        newAc.Withdraw();
                        break;
                    case 3:
                        newAc.DisplayInformation();
                        break;
                    case 4:
                        newAc.DisplayBalance();
                        break;
                    default :
                        throw new IllegalArgumentException();

                }
            }catch(IllegalArgumentException e){
                System.out.println("Invald");

            }
            }
        }
        else{
            throw new IllegalArgumentException("Invalid Account Number.");
        }
    }

}

    


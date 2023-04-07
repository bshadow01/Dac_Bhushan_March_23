import java.util.*;

class Vehicle{
    
    String vehicleType;
    int numAxles;
    double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    //setters
    public void setvehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public void setnumAxles(int numAxles){
        this.numAxles=numAxles;

    }

    public void setdistanceTraveled(double distanceTraveled){
        this.distanceTraveled=distanceTraveled;

    }

    //Getters
    public String getvehicleType(){
        return vehicleType;
    }

    public int getnumAxles(){
        return numAxles;
    }
    
    public double getdistanceTraveled(){
        return distanceTraveled;
    }

    public double gettotalAmountDue(){
        return totalAmountDue;
    }

    public double gettollFee(){
        return tollFee;
    }

    public void calculateTollFee(){
        if(vehicleType.equals("car") || vehicleType.equals("vans") || vehicleType.equals("buses")){
            tollFee = 0.25*distanceTraveled;
            
        }
        else if(vehicleType.equals("Trucks")){
            tollFee = 0.50*distanceTraveled;
            
        }
        else{
            System.out.println("Invlid type");

        }
        totalAmountDue = tollFee+2.00;
    }

    public void generateBill(){
        System.out.println("Vehicle type :-> "+this.getvehicleType());
        System.out.println("Num Axles :-> "+this.getnumAxles());
        System.out.println("Distance Traveled :-> "+this.getdistanceTraveled());
        System.out.println("Toll Fee :-> "+this.gettollFee());
        System.out.println("Total AmountDue :-> "+this.gettotalAmountDue());
        
    }

    public int showMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("__________________________________________________");
        System.out.println("1 -> Enter vehicle type (car, van, bus, or truck)");
        System.out.println("2 -> Enter number of axles");
        System.out.println("3 -> Enter distance travelled");
        System.out.println("4 -> Calculate toll fee");
        System.out.println("5 -> Generate bill");
        System.out.println("6 -> Exit ");
        System.out.print("Enter your choice :-> ");
        return sc.nextInt();

    }

}

public class TollBoothBillGenerator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Vehicle veh1 = new Vehicle();

       
        int choice;
        while( ( choice = veh1.showMenu( ) ) != 6 ){ 
            try{      
            switch( choice ){
                case 1:
                    System.out.print("Enter Your Vehicle type :-> ");
                    veh1.setvehicleType(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter Your Num Axles :-> ");
                    veh1.setnumAxles(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Your Distance Traveled (in miles):-> ");
                    veh1.setdistanceTraveled(sc.nextDouble());
                    break;
                case 4:
                    veh1.calculateTollFee();
                    break;
                case 5:
                    veh1.generateBill();
                    break;
                default :
                    throw new IllegalArgumentException();

            }
        }catch(IllegalArgumentException e){
            System.out.println("Invald");

        }

    }
    
    }
}


import java.util.*;
class BMICal{
    private double height;
    private double weight;

    BMICal(double height , double weight){
        this.height=height;
        this.weight=weight;
    }

    public void setheight(double height){
        this.height=height;
    }

    

    public void setweight(double weight){
        this.weight=weight;
    }

    public double getheight(){
        return this.height;
    }

    public double getweight(){
        return this.weight;
    }

    public void formula(){
        System.out.println("Your BMI is :-> "+ weight / (height * height));

    }


}
class Assig2BMICal{
    public static void main(String args[]){
        System.out.println("Welcome BMI Calculator.....!!!!");
        System.out.println("__________________________________________________");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in Meters :->");
        double height = sc.nextDouble();
        System.out.print("Enter your weight in Kilograms :->");
        double weight = sc.nextDouble();

        BMICal cal1 = new BMICal(height,weight);


        cal1.setheight(height);
        cal1.setweight(weight);

        System.out.println();

        System.out.println("Your Height :-> "+cal1.getheight());
        System.out.println("Your Weight :-> "+cal1.getweight());

        cal1.formula();



    }
}
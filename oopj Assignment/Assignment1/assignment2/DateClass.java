import java.util.*;

class Date{
    int day;
    int month;
    int year;
    int monthN[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    String days[] = {"Sunday","Monday","Tuesday","Wenesday","Thusday","Friday","Saturday"};

    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }

    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

   public boolean isValid(){
    if(this.day <= 31 && this.month<=12 && this.year>0000){
        return true;
    }
    else{
        return false;
    }

   }

   public void getDayOfWeek(){
    

   }


}

public class DateClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Date date1 = new Date();

        System.out.print("Enter Current Date :-> ");
        date1.setDay(sc.nextInt());
        System.out.print("Enter Current's Month :-> ");
        date1.setMonth(sc.nextInt());
        System.out.print("Enter Current's Year :-> ");
        date1.setYear(sc.nextInt());

        System.out.println(date1.isValid());

    }
   
    
}





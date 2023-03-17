import java.util.*;
class comp{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		int total= num1>num2?num1+num2:num1-num2;
		System.out.println("Total is "+total);
	}
	
}		

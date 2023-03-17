import java.util.Scanner;
class Even{
	public static void main(String[]args){
		int number;
		System.out.println("Enter the Number");
		Scanner num = new Scanner(System.in);
		number = num.nextInt();
		/*if (number%2==0){
			System.out.println("The Given Number is EVEN");
		}
		else{
			System.out.println("The Given Number is ODD");
		};*/
		
		String var = number%2==0?"even":"odd";
		System.out.println("The given number is "+var);
		
		
		
	};
};
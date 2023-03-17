import java.util.*;
class variable{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	int a = sc.nextInt();
	System.out.println("Enter the second number");
	int b = sc.nextInt();
	System.out.println("Enter the third number");
	int c = sc.nextInt();
	
	int max = a>b&&a>c?a:b>a&&b>c?b:c;
	System.out.println("The Max number is = " +max);
	
	int min =a<b&&a<c?a:b<a&&b<c?b:c;
	System.out.println("The Min number is = " +min);
}
}
	
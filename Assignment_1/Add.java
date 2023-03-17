import java.util.Scanner;
class Add{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i<=b;i++){
			a=a+1;
		}
		System.out.println("sum = " +a);
	}
}
		
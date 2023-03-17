import java.util.Scanner;
class checknum{
	public static void main(String args[]){
		int num ;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num>0){
			System.out.println("The Number "+num+" is even");
		}
		else{
			System.out.println("The Number "+num+"is odd");
		}
	}
}	
import java.util.Scanner;
class voter{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Are you indain 1 or not 0");
		int count = sc.nextInt();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		String ele = (age > 18 && count ==1)? "elegible":"not elegible";
		System.out.println("you are " + ele);
		
		
		
	}
}
		
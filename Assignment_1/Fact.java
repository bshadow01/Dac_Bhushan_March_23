/*class Fact{
	public static void main(String args[]){
		int num = 5;
		int i,fact=1;
		for (i=2;i<=num;i++){
			fact*=i;
		}
		System.out.println(fact);
	}
}*/

class Fact{
	static int Factorial(int i){
		
		if(i==1){
			return 1;
		}
		else{
			return i*Factorial(i-1);
		}
	}
	public static void main(String args[]){
		int j = 5;
		System.out.println("Factorial ="+Factorial(j));
	}
	}
		
class problem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 1;
		for(int i=num;i>=1;--i){
			sum = sum*i;
		}
		System.out.println(sum);
	}
}
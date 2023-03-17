import java.util.*;
/* Write a program to calculate the sum of first 10 natural number.
class problem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;
		sum = sum + (num*(num+1)/2);
		System.out.println("the sum is = " +sum);
	}
}*/
/*Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
class problem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive number ");
		int num = sc.nextInt();
		int mul = 0;
		if(num>0)
		{
			for(int i=0;i<=10;i++){
				mul = num *i;
				System.out.println(num +" * " + i +" = " + mul);
			}
		}
		else{
			System.out.println("You have enterd wrong value");
		}
		
		}
	}
*/

/*class problem{
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
*/

/*class problem{
	public static void main(String args[]){
		String s = "tayu";
		String rev ="";
		for(int i= s.length()-1;i>=0;--i){
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
*/
/* Power of given number
class problem {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		System.out.println("Enter the power of number");
		int num2 = sc.nextInt();
		int pow = 1;
		
		for(int i = 1; i<=num2; i++){
			pow = pow*num1;
			
		}
		System.out.println("The power is " + pow);
	}
}

_________________________________________________
static int power(int N, int P)
    {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }
*/
/*class problem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i = 1; i<=n;i++){
			for(int j = 1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*
**
***
****
*****
*/

/*Febonacci Series
class problem{
	public static void main(String args[]){
		int a= 0 , b=1,c=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  Range");
		int range = sc.nextInt();
		
		while(i!=range){
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			i++;
		}
	}
}*/

/*class problem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int org=num,count=0,sum=0,rem;
		
		while(num!=0){
			num = num/10;
			count++;
		}
		System.out.println(count);
		
		num = org;
		
		while(num>0){
			rem = num % 10;
			int pro = 1;
			for(int j = 1;j<=count;j++){
				pro = pro*rem;

			}
			
			sum = sum+pro;
			num = num/10;
		}
		System.out.println(sum);
		if(org==sum){
			System.out.println("Number is Armstrong "+org);
		}
		else{
			System.out.println("Number is not Armstrong "org);
		}
		
	}
}*/

/*class problem{
	public static void main(String args[]){
		int i = 0;
		while(i<=1){
			System.out.println("hello");
			--i;
		}
	}
}
*/

			




























				
				
			
			




			
		
		
		

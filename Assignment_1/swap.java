class Swap{
	public static void main(String args[]){
		int a = 10;
		int b = 5;
		
		System.out.println("before a = "+a);
		System.out.println("before b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
	System.out.println("after a = "+a);
	System.out.println("after b = "+b);
	}
}

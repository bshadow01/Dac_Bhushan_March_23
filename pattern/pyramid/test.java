class test{
	public static void main(String args[]){
		int n = 5;
		for(int i=n;i>=1;i--){
			for(int j=n; j>=i; j--){
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
/*
1
21
321
4321
54321	
*/	
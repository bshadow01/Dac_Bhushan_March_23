class pattern38{
	public static void main(String args[]){
		int row=9;
		for(int i=1;i<=row;i++){
			for(int k=row;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			
			for(int j=i-1; j>0; j--){
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
}
/*
         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
 
 */
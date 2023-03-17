class pattern10{
	public static void main(String args[])
	{
		int row=5;
		int alpha = 65;
		for (int i=5; i>0; i--){
			
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for (int k=5; k>=i; k--){
				System.out.print((char)(alpha+k-1)+" ");
			}
			System.out.println();
			}
	}
}
/*
    E
   E D
  E D C
 E D C B
E D C B A
*/
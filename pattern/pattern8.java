class pattern8{
	public static void main(String args[])
	{
		int row=5;
		for (int i=1; i<=row; i++){
			
			for (int k=1; k<=i; k++){
				System.out.print(row-k+1+" ");
			}
			System.out.println();
			}
	}
}
/*
    5
   5 4
  5 4 3
 5 4 3 2
5 4 3 2 1
*/
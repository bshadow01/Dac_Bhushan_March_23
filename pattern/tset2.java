class pattern8{
	public static void main(String args[])
	{
		int row=5;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			for (int k=5; k>row-i; k--){
				System.out.print(k+" ");
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
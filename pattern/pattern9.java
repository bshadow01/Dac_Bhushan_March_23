class pattern9
{
	public static void main(String args[])
	{
		int row=5;
		int alpha = 65;
		for (int i=1; i<=row; i++){
			for (int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			for (int k=0; k<i; k++){
				System.out.print((char)(alpha+k)+" ");
			}
			System.out.println();
			}
	}
}
/*
    A
   A B
  A B C
 A B C D
A B C D E

*/
class pattern34{
	public static void main(String args[]){
		int row=5;
		for(int i=1;i<=row;i++){
			for(int j=1; j<=row; j++){
				if(j==row || i==row || j==(row-i+1)) System.out.print("*");
				else System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}
/*
    *
   **
  * *
 *  *
*****

*/
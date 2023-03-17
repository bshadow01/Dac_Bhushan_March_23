class pattern41{
	public static void main(String args[]){
		int row=9;
		for(int i=1;i<=row;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=row;j>=i;j--){
				System.out.print(row-i+1+" ");
			}
			System.out.println();
		}
	}
}
/*
 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7
    6 6 6 6 6 6
     5 5 5 5 5
      4 4 4 4
       3 3 3
        2 2
         1
*/
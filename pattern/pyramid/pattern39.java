class pattern39{
	public static void main(String args[]){
		int row=9;
		for(int i=row;i>=1;i--){
			for(int k=i-1;k>=0;k--){
				System.out.print("  ");
			}
			for(int j=i; j<=row; j++){
				System.out.print(j+" ");
				
			}
			
			for(int j=row-1; j>=i; j--){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}
/*
                  9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
 */
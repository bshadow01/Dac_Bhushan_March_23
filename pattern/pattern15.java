class pattern15{
	public static void main(String args[]){
		int row = 5;
		for(int i=row; i>=1; i--){
			for(int j=row; j>row-i; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*
54321
5432
543
54
5
*/
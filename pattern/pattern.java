class pattern{
	public static void main(String args[]){
		int alpa = 65;
		for(int i = 0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print((char)(alpa+j));
			}
			System.out.println();
		}
	}
}
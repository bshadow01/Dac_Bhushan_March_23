class pattern5{
	public static void main(String args[]){
		int alpha = 65;
		int n = 5;
		for(int i=0;i<n;i++){
			for(int j=0; j<i; j++){
				System.out.print((char)(alpha+i));
			}
			System.out.println();
		}
	}
}
			

/*class pattern13{
	public static void main(String args[]){
		int row=5;
		int alpha=64;
		for(int i=1; i<=row;i++){
			for(int j=1;j<=row-i; j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}
	}
}
*/
class pattern13{
	public static void main(String args[]){
		int row=5;
		int alpha=65;
		for(int i=0; i<row;i++){
			for(int j=1;j<row-i; j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println();
		}
	}
}
/*
    A
   B B
  C C C
 D D D D
E E E E E
*/
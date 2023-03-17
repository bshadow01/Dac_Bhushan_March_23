class pattern32{
	public static void main(String args[]){
		int row=5;
		for(int i=5; i>=1; i--){
			for(int k=1; k<=row-i;k++){
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2; i<=row; i++){
			for(int j=1; j<=row-i;j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*

* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *

*/
class pattern46
{
	public static void main(String args[]){
		int n = 6;
		for(int i=1;i<=n;i++){
			
			for(int j=n-i; j>0; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				if(k==1 || i==n || i==k)System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
				
	}
}
/*

     *
    * *
   *   *
  *     *
 *       *
* * * * * *

*/
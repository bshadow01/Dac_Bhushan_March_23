/*class loop{
	public static void main(String[] args){
		int i = 0,j=0;
		for(;j<=3||i<=5;i++,j++){
			System.out.println("i = "+i+" j = "+j);
		}
	}
}

i = 0 j = 0      Due to the OR || condition this for loop is going till i<=5
i = 1 j = 1        0    0  0           
i = 2 j = 2        1    0  1       
i = 3 j = 3        0    1  1         
i = 4 j = 4        1    1  1
i = 5 j = 5
*/

/*class loop{
	public static void main(String[] args){
		int i = 0,j=0;
		for(;j<=3&&i<=5;i++,j++){
			System.out.println("i = "+i+" j = "+j);
		}
	}
}

i = 0 j = 0    Due to the && AND condition this for loop is going till j<=3
i = 1 j = 1        0  0  0
i = 2 j = 2        1  0  0
i = 3 j = 3        0  1  0
                   1  1  1

*/
/*class loop{
	public static void main(String[] args){
		int i = 0,j=1;
		for(;i<=5;i++){
			System.out.println("i = "+i+" j = "+j+ "=> "+ (i+j));
		}
	}
}

i = 0 j = 1=> 1
i = 1 j = 1=> 2
i = 2 j = 1=> 3
i = 3 j = 1=> 4
i = 4 j = 1=> 5
i = 5 j = 1=> 6

*/
/*class loop{
	public static void main(String[] args){
		int i = 5;
		for(;i>=0;i--){
			System.out.println("i = "+i);
		}
	}
}
i = 5
i = 4
i = 3
i = 2
i = 1
i = 0
*/

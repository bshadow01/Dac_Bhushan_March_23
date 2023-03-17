class range{
	static int ser(int i){
		if(i>=10){
			return i;
		}
		else{
			System.out.println(i);
			return ser(++i);
		}
	}
	public static void main(String args[]){
		int j = 1;
		System.out.println(ser(j));
	}
}
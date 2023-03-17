class Compound{
	public static void main(String args[]){
		int Principle= 50000000;
		int year = 5;
		float rate = 10.75f;
		double Amount=0;
		System.out.println(Principle);
		Amount=Principle*((1+10.75f/100)*(1+10.75f/100)*(1+10.75f/100));
		System.out.println("Amount = "+ Amount);
		double Compound_interest = Amount - Principle;
		System.out.println("Compound_interest = "+Compound_interest);
	
	}
}
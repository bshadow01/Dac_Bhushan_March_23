class Salary{
	public static void main(String args[]){
		System.out.println("hello");
		double Basic_Salary = 10000.8989009;
		double Petrol_Allows=7000.3443534546;
		double DA,Tax_Deduction,Gross_Salary,Net_Salary;
		float TA=5600.6778F;
		System.out.println("The Basic_Salary = "+Basic_Salary);
		DA = (14*Basic_Salary)/100;
		System.out.println("DA = "+DA);
		
		Gross_Salary = Basic_Salary+Petrol_Allows+DA+TA;
		System.out.println("The Gross_Salary ="+Gross_Salary);
		
		Tax_Deduction = (1.76*Gross_Salary)/100;
		System.out.println("The Tax_Deduction = " +Tax_Deduction);
		
		Net_Salary = Gross_Salary- Tax_Deduction;
		System.out.println("The Net_Salary ="+ Net_Salary);
		
		
		
		
		
		
	}
} 
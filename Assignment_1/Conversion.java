class Conversion{
	public static void main(String args[]){
		float Cel = 44F;
		float Feh,Cel2;
		
		Feh = (Cel*1.8f)+32f;
		System.out.println("The Feh is = "+Feh);
		
		Cel2 = (Feh - 32)*5/9f;
		System.out.println("The Cel2 is = "+Cel2);
	}
}

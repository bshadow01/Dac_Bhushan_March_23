/*
31.Read the documentation of NumberFormatException and try to generate it in Java code.
*/

class Assig26
{
    public static void main(String[] args) 
    {
        String strNumber = new String( "12AB3DF" );
         int number = Integer.parseInt(strNumber);
        //java.lang.NumberFormatException
 
         System.out.println("Number : "+number);
    }
 }
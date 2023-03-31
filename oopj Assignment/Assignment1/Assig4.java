/*
9.Write a program to convert state of Byte instance into byte, short, int. long, float and double
*/
public class Assig4 {
    public static void main(String[] args) {
    byte a = 7;  
    Byte b = new Byte(a);
    System.out.println(b.byteValue());
    System.out.println(b.shortValue());
    System.out.println(b.intValue());
    System.out.println(b.floatValue());
    System.out.println(b.doubleValue());
    System.out.println(b.longValue());

   }
}
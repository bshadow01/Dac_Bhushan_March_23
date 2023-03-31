/*
8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/
class Assig3{
    public static void main(String args[]){
        byte b = 120;
        String s = new String(Byte.toString(b));
        System.out.println(" byte value into String "+Byte.toString(b));
        System.out.println(" byte value into Byte instance. "+Byte.valueOf(b));
        System.out.println(" String instance into Byte instance. "+Byte.valueOf(s));
    }
} 
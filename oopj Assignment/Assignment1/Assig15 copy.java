/*
20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
*/
class Assig15{
    public static void main(String args[]){
        long b = 120;
        String s = new String(Long.toString(b));
        
        System.out.println("int value into String "+Long.toString(b));
        System.out.println("int value into Long instance.. "+Long.valueOf(b));
        System.out.println("String instance into Long instance. "+Long.valueOf(s));
        System.out.println("int value into binary " +Long.toBinaryString(b) );
        System.out.println("int value into octal "+Long.toOctalString(b) );
        System.out.println("int value into hexadecimal "+Long.toHexString(b));
    }
} 
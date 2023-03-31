/*28
Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string
(Note: Here you can use doubleToLongBits() method along with methods of Long class)
*/
class Assig23{
    public static void main(String args[]){
        double b = 120;
        String s = new String(Double.toString(b));
        
        System.out.println("double value into String "+Double.toString(b));
        System.out.println("double value into double instance.. "+Double.valueOf(b));
        System.out.println("double instance into double instance. "+Double.valueOf(s));
        System.out.println("double value into hexadecimal "+Double.toHexString(b));
        System.out.println("double value into binary :"+ Long.toBinaryString(Double.doubleToLongBits(b)));
        System.out.println("double value into octal :"+ Long.toOctalString(Double.doubleToLongBits(b)));
    }
} 
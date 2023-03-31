/*
13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
*/
class Assig8{
    public static void main(String args[]){
        short num = 128;
        System.out.println("short value into String "+Short.toString(num));
        short num1 = new Short(num);
        System.out.println("short value into Short instance. "+ num1);
        String str = new String("128");
        System.out.println("String instance into Short instance. "+ Short.valueOf(str));

        
    }
} 
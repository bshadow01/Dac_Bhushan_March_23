/*
19.Write a program to perform below operations on long type to get: 
a. The number of bits used to represent a long value 
b. The number of bytes used to represent a long value 
c. The minimum value a long 
d. The maximum value a long
*/

class Assig14{
    public static void main(String args[]){
        long l= 500;
        System.out.println("The number of bits used to represent a long value "+ Long.SIZE);
        System.out.println("The number of bytes used to represent a long value "+ Long.BYTES);
       // int min = Long.MIN_VALUE;
       // int max = Long.MAX_VALUE;
        System.out.println("The minimum value a long "+ Long.MIN_VALUE );
        System.out.println("The maximum value a long "+Long.MAX_VALUE );

    }
}
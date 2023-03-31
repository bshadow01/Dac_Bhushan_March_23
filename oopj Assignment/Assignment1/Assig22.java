/*
27.Write a program to perform below operations on Double type to get: 
a. The number of bits used to represent a double value 
b. The number of bytes used to represent a double value 
c. The minimum value a double 
d. The maximum value a double
*/

class Assig22{
    public static void main(String args[]){
        double a = 124;
        double b = 120;
        double sum = Double.sum( a, b);
        double min = Math.min(a, b);
        double max = Math.max( a, b);
        System.out.println("sum of two double numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}
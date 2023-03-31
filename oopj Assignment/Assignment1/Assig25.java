/*
30.Write a program to find minimum and maximum number as well as to add two double numbers using methods of Double.
*/

class Assig25{
    public static void main(String args[]){
        double a = 124;
        double b = 120;
        double sum = Double.sum( a, b);
        double min = Math.min(a, b);
        double max = Math.max( a, b);
        System.out.println("sum of two integer numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}
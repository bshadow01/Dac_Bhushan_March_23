/*
26.Write a program to find minimum and maximum number as well as to add two float numbers using methods of Float.
*/
class Assig21{
    public static void main(String args[]){
        float a = 124;
        float b = 120;
        float sum = Float.sum( a, b);
        float min = Math.min(a, b);
        float max = Math.max( a, b);
        System.out.println("sum of two integer numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}
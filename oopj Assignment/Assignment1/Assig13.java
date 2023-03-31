/*18
Write a program to find minimum and maximum number as well as to add two integer numbers using methods of Integer.
*/
class Assig13{
    public static void main(String args[]){
        int a = 124;
        int b = 120;
        int sum = Integer.sum( a, b);
        int min = Math.min(a, b);
        int max = Math.max( a, b);
        System.out.println("sum of two integer numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}
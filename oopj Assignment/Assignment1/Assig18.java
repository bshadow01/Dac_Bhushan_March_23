/*23
Write a program to perform below operations on float type to get: 
a. The number of bits used to represent a float value 
b. The number of bytes used to represent a float value 
c. The minimum value a float
d. The maximum value a float
*/

class Assig18{
    public static void main(String args[]){
        float a = 124;
        float b = 120;
        float sum = Float.sum( a, b);
        float min = Math.min(a, b);
        float max = Math.max( a, b);
        System.out.println("sum of two float numbers "+sum);
        System.out.println("minimum number "+ min);
        System.out.println("maximum number "+ max);

    }
}
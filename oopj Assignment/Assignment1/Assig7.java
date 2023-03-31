/*
12.Write a program to perform below operations on short type to get: a. The number of bits used to represent a short value b. The number of bytes used to represent a short value c. The minimum value a short d. The maximum value a short
*/

class Assig7{
    public static void main(String args[]){
        short num = 500;
        System.out.println("The number of bits used to represent a short value "+ Short.SIZE);
        System.out.println("The number of bytes used to represent a short value "+ Short.BYTES);
        int min = Short.MIN_VALUE;
        int max = Short.MAX_VALUE;
        System.out.println("The minimum value a short "+ min );
        System.out.println("The maximum value a short "+ max );

    }
}
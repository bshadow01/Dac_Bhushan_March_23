/*
Write a program to perform below operations on char type to get: 
a. The number of bits used to represent a char value 
b. The number of bytes used to represent a char value 
c. The minimum value a char 
d. The maximum value a char
*/

class Assig5{
    public static void main(String args[]){
        char ch ;
        System.out.println("The number of bits used to represent a char value "+ Character.SIZE);
        System.out.println("The number of bytes used to represent a char value "+ Character.BYTES);
        int min = Character.MIN_VALUE;
        int max = Character.MAX_VALUE;  
        System.out.println("The minimum value a char "+ min );
        System.out.println("The maximum value a char "+ max );
         

    }
}
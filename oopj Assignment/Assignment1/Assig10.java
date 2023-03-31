/*15
Write a program to perform below operations on int type to get: 
a. The number of bits used to represent a integer value 
b. The number of bytes used to represent a integer value 
c. The minimum value a integer 
d. The maximum value a integer
*/

class Assig10{
    public static void main(String args[]){
        int num = 500;
        System.out.println("The number of bits used to represent a integer value "+ Integer.SIZE);
        System.out.println("The number of bytes used to represent a integer value "+ Integer.BYTES);
       // int min = Short.MIN_VALUE;
       // int max = Short.MAX_VALUE;
        System.out.println("The minimum value a integer "+ Integer.MIN_VALUE );
        System.out.println("The maximum value a integer "+Integer.MAX_VALUE );

    }
}
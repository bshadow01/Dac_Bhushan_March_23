/*
21.Write a program to convert state of Long instance into byte, short, int, long, float and double.
*/
class Assig16{
    public static void main(String args[]){
        long num1 = 129;
        Long num = new Long(num1);
        System.out.println(num.byteValue());
        System.out.println(num.shortValue());
        System.out.println(num.intValue());
        System.out.println(num.floatValue());
        System.out.println(num.doubleValue());
        System.out.println(num.longValue());
    }
}
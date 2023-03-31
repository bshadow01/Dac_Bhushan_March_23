/*14
Write a program to convert state of Short instance into byte, short, int, long, float and double.
*/

class Assig9{
    public static void main(String args[]){
        short num = new Short((short)129);
        byte b = (byte)num;
        short sh = (short)num;
        int i = (int)num;
        long l = (long)num;
        float f = (float)num;
        double d = (double)num;
        System.out.println("short to byte "+b);
        System.out.println("short to short "+sh);
        System.out.println("short to int "+i);
        System.out.println("short to long "+l);
        System.out.println("short to float "+f);
        System.out.println("short to double "+d);
             
        
    }
} 
import java.util.Scanner;
public class Arrli {
    public static void main(String[] args) {
        //Java has 8 primitive data types =: char, boolean,byte,short, int, long, float and double.For this
        //exercise, we'll work with the primitive used to build integer values(byte,short,int and long):
        // A byte is an 8-bit signed integer
        // A short is a 16-bit signed integer
        // An int is a 32 bit signed integer
        //A long is a 64-bit signed integer
        //Given an input integer, you must determine which primitive data types are capable of properly storing that
        //input
        Scanner sc= new Scanner(System.in);

        double a=sc.nextDouble() ;
        try {

            if (a >= -128 && a <= 127) {
                System.out.println(a + " is byte,short, int,long");
                System.out.println("Byte is preferred");

            } else if (a >= -32768 && a <= 32767) {
                System.out.println(a + " is short,int and long");
                System.out.println("Short is preferred");
            } else if (a >= -2147483648 && a < 2147483647) {
                System.out.println(a + " is int and long");
                System.out.println("Int is preferred");
            } else if (a <= 9223372036854775807L && a >= -9223372036854775808L) {
                System.out.println(a + " is long");
                System.out.println("long is preferred");
            } else {
                System.out.println(a + " can't be fitted anywhere");
            }
        }
        catch(Exception e){
            System.out.println("sdfsd");
        }

    }
}

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        //The two type should be compatible
        //Destination type should be greater than the source type for automatic typecating

        //Compressing the bigger number into a smaller number is known as typecasting



        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println(num);
//       // scanner.nextFloat();
//       // scanner.nextByte();
//
//        int a = (int)(23.45f);
//        System.out.println(a);


        //operation between primitive data types

        byte b = 10;
        int i = 2345;
        float f = 23.1234f;
        short s  = 1234;
        Double d= 12334.3212;
        char c ='t';

       double result = (i*b)+ (s/f)+ (c-d);
        System.out.println(result);
    }
}
//integer is smaller than float
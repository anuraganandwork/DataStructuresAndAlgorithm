import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        //The two type should be compatible
        //Destination type should be greater than the source type for automatic typecating

        //Compressing the bigger number into a smaller number is known as typecasting



        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
       // scanner.nextFloat();
       // scanner.nextByte();

        int a = (int)(23.45f);
        System.out.println(a);
    }
}
//integer is smaller than float
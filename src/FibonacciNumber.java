import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        int a = 0;
        int b=1;
       int nextNum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series");
       int n =  scanner.nextInt();
       // System.out.println(a);
       // System.out.println(b);

//        while (b<50) {
//            int nextNum = a + b;
//            System.out.println("Next fibonacci number is : "+nextNum);
//            a = b;
//            b = nextNum;
//        }
if (n==0){
    System.out.println(
            "Fibonacci number is "+a
    );
}

else if (n==1){
    System.out.println(
            "Fibonacci number is "+b
    );
}
    else {
    for (int i = 2; i <= n; i++) {
        nextNum = a + b;
        a = b;
        b = nextNum;
    }
    System.out.println("Fibonacci number is : " + nextNum);
}


    }
}

//739
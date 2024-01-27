import java.util.Scanner;

public class isprime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int num = scanner.nextInt();
        isPrime(num);
    }

    static void isPrime(int i){
        if (i>0){

            for (int j =2; j<i;j++){
                if (i%j==0&&i%1==0){
                    System.out.println(i+" is a prime");
                }
                else {
                    System.out.println(i+" is not prime");
                }
            }



        }


    }
}

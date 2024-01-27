import java.util.Scanner;

public class FindNumberOfChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = scanner.next();
        System.out.println("Enter the integer to be counted");
        char n = scanner.next().charAt(0);
        int numberOfSevens =0;
        for (int i=0; i<= number.length()-1; i++){
           // System.out.println(number.charAt(5)); // this is giving result

            if(number.charAt(i)==n){
                numberOfSevens= numberOfSevens+1;
            }
            else {
//                System.out.println("NO 7 found"+n);
            }
        }

        System.out.println("Total number of "+n+" are "+numberOfSevens);
    }
}

import java.util.Scanner;

public class CaseChecker {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        char c =  scanner.next().charAt(0);
        if(65<= c  && c <= 90){

            System.out.println("This is a uppercase letter");


        }

        else if (97<= c  && c<= 122){

            System.out.println("This is a lowercase letter");

        }

        else System.out.println("Invalid input");
    }


}

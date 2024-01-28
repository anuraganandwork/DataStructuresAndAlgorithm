import java.util.Scanner;
import java.util.stream.LongStream;

public class FunctionSecond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //int c = scanner.nextInt();
       // eligibleToVote(a);
       // System.out.println(isPrime(a));
        //showGrade(a);
       // factorial(a);
       // isPalindrome(a);
       // isPythagoreanTriplet(a,b,c);
        givePrimesBetween(a,b);

    }

    static void eligibleToVote(int age){
        if (age>= 18){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }

    static  boolean isPrime(int num){
       if (num <= 1) {
           return false;
       }

       else {
           for (int i =2; i< num ; i++){
               if (num%i==0){
                   return false;
               }

           }

       }
       return true;
    }


    static void showGrade(int marks){

       if (marks >=91 && marks <=100) System.out.println("Grade id AA");
       else if (marks >= 81 && marks <=90) System.out.println("Grade id AA");
       else if (marks >= 71 && marks <=80) System.out.println("Grade id AB");
       else if (marks >= 61 && marks <=70) System.out.println("Grade id BB");
       else if (marks >= 51 && marks <=60) System.out.println("Grade id BC");
       else if (marks >= 41 && marks <=50) System.out.println("Grade id CD");
       else System.out.println("Fail, try out something else or try harder");

    }


    static void factorial(int num){
        int factorial = 0;

        if (num ==0 || num==1){
            System.out.println("1");
        }
        else{
         for(int i = 1; i< num ; i++){

           factorial=  num*i;

         }
            System.out.println(factorial);


        }}


    static void isPalindrome(int num){

        int numberEntered = num;
        String newNum="";
        while (num>0){
          newNum= newNum+num%10;
          num=num/10;
        }


        if (newNum.equals(Integer.toString(numberEntered))){
            System.out.println("The num is Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }


    }

    static void isPythagoreanTriplet(int a, int b, int c){

        int hypotenuse = findMax(a,b,c);
        System.out.println(hypotenuse);
        if (hypotenuse ==a ){
            if (hypotenuse*hypotenuse == b*b + c*c){
                System.out.println("A pythagorean triplet with hypotenuse "+a);
            }
            else System.out.println("Not a pythagorean triplet");
        }
         if (hypotenuse==b) {
            if (hypotenuse*hypotenuse == a*a + c*c){
                System.out.println("A pythagorean triplet with hypotenuse "+b);
            }
            else System.out.println("Not a pythagorean triplet");
        }
         if (hypotenuse ==c) {

            if (hypotenuse*hypotenuse == b*b + a*a){
                System.out.println("A pythagorean triplet with hypotenuse "+c);
            }
            else System.out.println("Not a pythagorean triplet");

        }
        else System.out.println("Invalid entry");
    }

   static int findMax(int a, int b, int c){
        int max = a;
        if(b> max){
            max = b;
        }
         if (c> max) {
            max = c;
        }
       else max=a;
        return max;
   }



   static void givePrimesBetween(int a, int b){
      if (b>a) {
        for (int i = a;i<b;i++){

            for (int j=2;j<i;j++){
                if(i%j != 0){
                    System.out.println(i+" is a prime number");
                }
            }

        }
   }
      else System.out.println("enter smaller number first");

}}
//120

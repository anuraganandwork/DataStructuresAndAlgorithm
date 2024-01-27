import java.util.Scanner;

public class FunctionsQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
       // int b = scanner.nextInt();
       // int c = scanner.nextInt();


//       int maxOfThem= maxNumber(a,b,c);
//        System.out.println(maxOfThem);
//        int minOfThem = minNum(a,b,c);
//        System.out.println(minOfThem+"min");


        findEvenOrOdd(a);
    }




    //max method
    static int maxNumber(int a, int b, int c){
        int max = 0;

        max = a;
        if( b > max && c < max){
            max = b;
            if ( c > max){
                max = c;
            }

            else{
                max=b;
            }

        } else if ( c > max && b < max) {
            max = c;
           if (b > max){
               max = b;
           }
           else{
               max = c;
           }

        }

        else if (c > max && b> max){
            max = b;
            if (c > max){
              max = c;

            }
            else {max = b;}


        }


else {max =a ;}


        return  max;
    }



    static  int minNum(int a , int b , int c){
        int min = 0;
        min = a;
        if ( b < min){
            min = b;
        }
       else if (c < min){
            min = c;
        }

       else{
           min = a;
        }

       return  min;

    }

    static void findEvenOrOdd(int num){
        if (num%2==0){
            System.out.println(num + "is even");
        } else  {
            System.out.println(num +" is odd");
        }
    }

}
//1021
import java.util.ArrayList;
import java.util.Scanner;

public class ArrlistOfArraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(5);


        for (int i =0; i<3;i++){
            arr.add( new ArrayList<>());
        }



        System.out.println(arr);

        for (int i =0; i<3;i++){
            for (int j =0; j<3;j++){
                arr.get(i).add(scanner.nextInt());
            }
        }

        System.out.println(arr);


    }
}

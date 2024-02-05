import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistclass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.println(list);
        list.add(5);
        list.add(6);

        list.add(7);

        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(53);

//
//        System.out.println(list);
//list.set(0,99);
//        System.out.println(list);


ArrayList<ArrayList<Integer>> secondList = new ArrayList<>(5);
        System.out.println(secondList);

        //initialisation of this arraylist
for (int i =0;i<3;i++){
    secondList.add(new ArrayList<>());
}


//add something in the arraylist

        for (int i = 0; i < 3; i++){

            for (int j = 0; j<3; j++){
                secondList.get(i).add(scanner.nextInt());
            }

        }
        System.out.println(secondList);


    }
}
//Arraylist can expand its size beyond the defined one
//keep watching the sugestions, what kind of datatype they are want
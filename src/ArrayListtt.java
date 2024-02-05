import java.util.ArrayList;

public class ArrayListtt {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(5);

        arr.add(1123);
        arr.add(32);
        arr.add(123543);
        arr.add(1123);
        arr.add(32);
        arr.add(123543);
        arr.add(1123);
        arr.add(32);
        arr.add(123543);
        arr.add(1123);
        arr.add(32);
        arr.add(123543);
        arr.add(1123);
        arr.add(32);
        arr.add(123543);
        arr.add(1123);
        arr.add(32);
        arr.add(123543);
        System.out.println(arr);

        for (int i =0; i<6;i++){
            System.out.println(arr.get(i));
        }

    }

}
// Arraylist calls its toString() internally , we do not need to write it
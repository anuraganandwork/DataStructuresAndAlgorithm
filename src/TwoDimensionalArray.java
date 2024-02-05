public class TwoDimensionalArray {
    public static void main(String[] args) {


        int[][] arr = new int[4][];
// number of columns is not must
        int[][] arrr = {
                {1,2,3},
                {45,6,7,5},
                {5,6,7}
        };

        for (int i =0; i< arrr.length;i++){
            for (int j =0; j< arrr[i].length; j++){
                System.out.print(arrr[i][j]+" ");
            }
            System.out.println();
        }

// we can also use Arrays.toString(nameOfTheArray) instead of two for loops
        System.out.println(arrr);
    }
}

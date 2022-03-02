import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
//        String[][] seatingChart =   {{"Abby", "Don", "George", "Kim"},
//                                    {"Brian", "Elenor", "Harry", "Lenny"},
//                                    {"Cathy", "Fred", "Jill", "Matt"}};
//        for (String[] x : seatingChart)
//        {
//            System.out.println(Arrays.toString(x));
//        }
//
//        seatingChart[1][2] = "Paul";
//        for (String[] x : seatingChart)
//        {
//            System.out.println(Arrays.toString(x));
//        }
//
//        String temp = seatingChart[0][0];
//        seatingChart[0][0] = seatingChart[2][3];
//        seatingChart[2][3] = temp;
//        for (String[] x : seatingChart)
//        {
//            System.out.println(Arrays.toString(x));
//        }
//
//        String[] temp2 = seatingChart[0];
//        seatingChart[0] = seatingChart[1];
//        seatingChart[1] = temp2;
//        for (String[] x : seatingChart)
//        {
//            System.out.println(Arrays.toString(x));
//        }


        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        for (int[] x : arr1)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        for (int[] x : arr2)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;
        for (int[] x : arr1)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        for (int[] x : arr2)
        {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();

        int[][] arr3 = {{5, 2},
                        {1, 3},
                        {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(arr3));

        String[][] arr4 = {{"time", "up", "bye"},
                           {"hi", "hit", "up"},
                           {"map", "bam", "low"},
                           {"bow", "mom", "joy"}};
        FunWith2DArrays.fourCorners(arr4);
    }
}
public class FunWith2DArrays
{
    public static int totalElements(int[][] arr)
    {
        int total = 0;
        for (int[] x : arr)
        {
            total += x.length;
        }
        return total;
    }

    public static void fourCorners(String[][] arr)
    {
        System.out.println(arr[0][0]);
        System.out.println(arr[0][arr[0].length -1]);
        System.out.println(arr[arr.length-1][0]);
        System.out.println(arr[arr.length-1][arr[0].length-1]);
    }

    public static double average(int[][] arr)
    {
        double sum = 0;
        int length = 0;
        for (int[] row : arr)
        {
            for (int num : row)
            {
                sum += num;
                length++;
            }
        }
        return sum / length;
    }

    public static int[] indexFound(String[][] arr, String target)
    {
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                if (target.equals(arr[row][col]))
                {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

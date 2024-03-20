
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void setUp(int[][] a){
        for (int[] row : a){
            for (int value : row){
                System.out.print(value + " ");
            }
        } System.out.println();
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] arr){
        int sum = 0;
        for(int[] row : arr){
            for (int value : row){
                sum += value;
            }
        } return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] arr) {
        int sum = sum(arr);
        int totalElements = arr.length * arr[0].length;
        return (double) sum / totalElements;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] row : arr){
            for (int value : row){
                if (value < min){
                    min = value;
                }
            }
        } return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        } return max;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] arr){
        int evenNums = 0;
        for (int[] row : arr){
            for (int value : row) {
                if (value%2 == 0){
                    evenNums++;
                }
            }
        } return evenNums;
    }


    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                if (value <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] arr) {
        int numRows = arr.length;
        int[] sums = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            int rowSum = 0;
            for (int value : arr[i]) {
                rowSum += value;
            }
            sums[i] = rowSum;
        } return sums;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;
        int[] sums = new int[numCols];

        for (int j = 0; j < numCols; j++) {
            int colSum = 0;
            for (int i = 0; i < numRows; i++) {
                colSum += arr[i][j];
            }
            sums[j] = colSum;
        }

        return sums;
    }

}

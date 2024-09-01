// //1 transport the array and reverse it
// //2 using a n-i-1 formula for columan 
import java.util.Arrays;

public class _22_RotatedMatrixBy90 {
    public static void main(String[] args) {
        // 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        print2DArray(matrix);

        // Rotate the matrix by 90 degrees clockwise
        rotateMatrixBy90(matrix);

        System.out.println("Matrix after rotating by 90 degrees clockwise:");
        print2DArray(matrix);
    }

    // Method to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrixBy90(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to get the final rotated matrix
        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
    }

    // Method to reverse a single row (1D array)
    public static void reverseRow(int[] row) {
        int start = 0, end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    // Method to print a 2D array (matrix)
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}

public class _23_SprialMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[5][5  ];
        int n = arr.length;
        int m = arr[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        int count = 1;
        while (top <= bottom && left <= right) {
            // right
            for (int i = left; i <= right; i++) {
                arr[top][i] = count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = count++;
                }
                bottom--;
            }

            for (int i = bottom; i >= top; i--) {
                arr[i][left] = count++;
            }
            left++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// output
// 1 2 3 4 5 6 7 8 9
// 32 33 34 35 36 37 38 39 10
// 31 56 57 58 59 60 61 40 11
// 30 55 72 73 74 75 62 41 12
// 29 54 71 80 81 76 63 42 13
// 28 53 70 79 78 77 64 43 14
// 27 52 69 68 67 66 65 44 15
// 26 51 50 49 48 47 46 45 16
// 25 24 23 22 21 20 19 18 17
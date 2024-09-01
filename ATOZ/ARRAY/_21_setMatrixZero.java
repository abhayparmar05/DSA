public class _21_setMatrixZero {
    public static void main(String[] args) {
        int n = 4;
        int m=4;
        int[][] a ={{1,1,1,1},{1,1,1,1},{1,1,0,1},{0,1,1,1}};
        int row[] = new int[4];
        int col[] = new int[4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<m; j++) {
                if(a[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
                
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(row[i]==1  || col[j]==1){
                    a[i][j]=0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}

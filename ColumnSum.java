import java.util.Scanner;
public class ColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] arr1 = columnSum(arr, n, m);
        for(int i=0;i<m;i++) {
            System.out.print(arr1[i]+ " ");
        }
        sc.close();
    }

    static int[] columnSum(int[][] arr,int n,int m) {
        int[] arr1 = new int[m];
        int sum =0;
        for(int i=0;i<m;i++) {
            sum = 0;
            for(int j=0;j<n;j++) {
                sum += arr[j][i];
            }
            arr1[i] = sum;
        }

        return arr1;
    }
}
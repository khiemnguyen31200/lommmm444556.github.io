import java.util.Scanner;

public class muitiarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // int arr[][]= new int [n][n];
        // for (int i = 0; i < n; i++){
        // for(int j =0;j<n;j++){
        // System.out.printf("Nhập phần tử thứ [%d][%d]",i,j);
        // arr[i][j] =scanner.nextInt();
        // }
        // }
        // for (int i = 0; i < n; i++){
        // for(int j =0;j<n;j++){
        // System.out.printf(arr[i][j] + "\t");

        // }
        // System.out.println();
        // }

        int arrA[][] = new int[n][n];
        input(arrA, n);

        System.out.println("Mảng A");
        show(arrA, n);

        int arrb[][] = new int[n][n];
        input(arrb, n);

        System.out.println("Mảng B");
        show(arrb, n);

        int arrc[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrc[i][j] = arrA[i][j] + arrb[i][j];
            }
        }
        System.out.println("Mảng C");
        show(arrc, n);


        //For each

        System.out.println("Sử dụng for each :");
    }

    // Tạo ma trận A

    // System.out.print("Mảng A");

    public static void input(int[][] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập phần tử thứ [%d][%d]", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void show(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(arr[i][j] + "\t");

            }
            System.out.println();
        }

    }
}

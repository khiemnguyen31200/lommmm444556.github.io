import java.util.Scanner;

public class homeWork {

    public static void main(String[] args) {

        // Nhập Array vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số mảng cần nhập");
        int n = scanner.nextInt();

        String[] arr = new String[n];
        scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ : " + i);
            arr[i] = scanner.nextLine();
        }
        System.out.println("Mảng sau khi nhập là :");
        for (String s : arr) {
            System.out.println(s);
        }
        int count = 0;
        System.out.println("Số lần chuỗi 'Java' xuất hiện là :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Java")) {
                count++;
            }
        }
        System.out.println(count);

        // Lập mảng quản lí động vật và thuộc tính của chúng
        System.out.println("Nhập vào số động vật cần nhập :");
        int numOfAni = scanner.nextInt();

        Animal [] animals = new Animal[numOfAni];

        for (int i = 0; i < numOfAni; i++){
            Animal Ani = new Animal();
            Ani.input();
            animals[i] = Ani;
        }
        System.out.println(" Dach sách động vật vừa nhập là :");
        for (Animal ani : animals) {
            System.out.println(ani.toString());
        }
        // Tạo ma trận
        System.out.println(" Nhập kích cỡ ma trân: ");
        int size = scanner.nextInt();
        int arr2C [][] = new int[size][size] ;
        input(arr2C,size);
        System.out.println("Ma trận vừa nhâp là");
        show(arr2C, size);
        
        System.out.println("Đường chéo chính là ");
        int sum = 0;
        for(int i=0;i<size;i++){
           for(int j=0;j<size;j++){
               if(i==j){
                   sum += arr2C[i][j];
                   System.out.println(arr2C[i][j]);
               }
           }
        }
        System.out.println("Tổng của đường chéo chính là " + sum);


        
    }
// Tạo các phương thức
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

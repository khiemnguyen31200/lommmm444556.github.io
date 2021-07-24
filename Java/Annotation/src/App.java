import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử mảng");
        try {
            int size = sc.nextInt();
            int[] arrNum = new int[size];
        } catch (NegativeArraySizeException e1) {
            System.out.println("Không tạo được mảng với số phần tử đó");
        }  catch (InputMismatchException e1) {
            System.out.println("Không tạo được mảng với số phần tử đó");
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double height;
        double weight;
        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        try {
            // System.out.println("Nhập chiều cao (m) ");
            // height = scanner.nextDouble();
            // if (height <= 0) {
            //     System.out.println("Vui lòng nhập lại");
            //     height = scanner.nextDouble();
            // }
            // System.out.println("Nhập cân nặng (kg)");
            // weight = scanner.nextDouble();
            // if (weight <= 0) {
            //     System.out.println("Vui lòng nhập lại");
            //     weight = scanner.nextDouble();
            // }
            // double bmi = weight / Math.pow(height, 2);
            // if (bmi < 18.5) {
            //     System.out.println(bmi);
            //     System.out.println("Bạn đang gầy");
            // } else if (bmi >= 18.5 && bmi < 25) {
            //     System.out.println(bmi);
            //     System.out.println("Bạn đang cân đối");
            // } else if (bmi > 25) {
            //     System.out.println(bmi);
            //     System.out.println("Bạn đang thừa cân");
            // }

            System.out.println("Nhập vào chiều dài của hình chữ nhật (DVDD)");
            a = scanner.nextDouble();
            if (a <= 0) {
                System.out.println("Vui lòng nhập lại");
                a = scanner.nextDouble();
            }
            System.out.println("Nhập vào chiều rộng của hình chữ nhật (DVDD)");
            b = scanner.nextDouble();
            if (b <= 0) {
                System.out.println("Vui lòng nhập lại");
                b = scanner.nextDouble();
            }
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    if (i == 1 || j == 1 || i == a || j == b) {
                        System.out.printf("*");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.printf("\n");
            }
        } catch (InputMismatchException e1) {
            System.out.println("Không hợp lệ");
            System.out.println("Vui lòng nhập lại");
        } catch (ArithmeticException e2) {
            System.out.println("Không hợp lệ");
            System.out.println("Vui lòng nhập lại");
        }

    }
}

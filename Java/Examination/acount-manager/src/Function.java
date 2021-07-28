import java.util.Scanner;

public class Function {
    Scanner scanner = new Scanner(System.in);

    public void GettingStart() {
        Menu menu = new Menu();
        menu.mainMenu();
        while (true) {
            try {
                int choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        Constroller control = new Constroller();
                        control.login();
                        break;
                    case 2:
                        Constroller control1 = new Constroller();
                        control1.createNewAccount();
                        break;
                    case 0:
                        System.exit(1);
                        break;
                }
            } catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số từ 0 đến 2, vui lòng nhập lại!");
                continue;
            }
        }
    }
}

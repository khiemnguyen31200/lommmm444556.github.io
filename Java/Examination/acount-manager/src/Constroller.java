
import java.util.List;
import java.util.Scanner;

public class Constroller {
    Repository repository = new Repository();
    Scanner scanner = new Scanner(System.in);
    Function fn = new Function();
    Menu menu = new Menu();
    Validate validate = new Validate();
    List<User> list = repository.getData();
    String UserName;
    String Passcode;
    String email;

    public void login() {
        System.out.println("Vui lòng nhập vào các thông tin sau: ");
        System.out.println("UserName");
        UserName = scanner.nextLine();
        System.out.println("Mật khẩu của bạn");
        Passcode = scanner.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(UserName)) {
                if (list.get(i).getPassword().equals(Passcode)) {
                    System.out.println("Chào mừng bạn  " + list.get(i).getUsername());
                    System.out.println("Bạn có thể thực hiện các chức năng sau: ");
                    menu.actionAcount();
                    while (true) {
                        try {
                            int choose = scanner.nextInt();
                            switch (choose) {
                                case 1:
                                    changeUsername();
                                    Startagain();
                                    break;
                                case 2:
                                    changeEmail();
                                    Startagain();
                                    break;
                                case 3:
                                    changePassword();
                                    Startagain();
                                    break;
                                case 4:
                                    Startagain();
                                    break;
                                case 0:
                                    System.exit(1);
                                    break;
                            }
                        } catch (ArithmeticException ex1) {
                            System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                            continue;
                        } catch (NumberFormatException ex2) {
                            System.out.println("lựa chọn phải là số từ 0 đến 4, vui lòng nhập lại!");
                            continue;
                        }
                    }

                }
            }
            System.out.println("Bạn đã quên mật khẩu phải không");
            forgotPassword();
        }
    }

    public void changePassword() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(UserName)) {
                System.out.println("User bạn muốn đổi tên có các thông tin như sau: ");
                System.out.println(list.get(i));
                scanner.nextLine();
                System.out.println("New password: ");
                String passcode = validate.validatePassword(scanner.nextLine());
                scanner.nextLine();
                list.get(i).setPassword(passcode);
            }
        }
    }

    public void changeUsername() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(UserName)) {
                System.out.println("User bạn muốn đổi tên có các thông tin như sau: ");
                System.out.println(list.get(i));
                System.out.println("New UserName: ");
                scanner.nextLine();
                String username = scanner.nextLine();
                list.get(i).setUsername(username);
            }
        }
    }

    public void changeEmail() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(UserName)) {
                System.out.println("User bạn muốn đổi tên có các thông tin như sau: ");
                System.out.println(list.get(i));
                scanner.nextLine();
                System.out.println("New Email: ");
                String email = validate.validateEmail(scanner.nextLine());
                list.get(i).setEmail(email);
            }
        }

    }

    public void forgotPassword() {
        menu.forgotPassword();
        while (true) {
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Vui lòng nhập vào email của bạn");
                        email = scanner.nextLine();
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getEmail().equals(email)) {
                                System.out.println("User bạn muốn đổi tên có các thông tin như sau: ");
                                System.out.println(list.get(i));
                                System.out.println("New password: ");
                                String passcode = validate.validatePassword(scanner.nextLine());
                                scanner.nextLine();
                                list.get(i).setPassword(passcode);
                            }
                        }
                        Startagain();
                        break;
                    case 2:
                        Startagain();
                        break;
                }
            } catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số  1 hoặc 2, vui lòng nhập lại!");
                continue;
            }
        }

    }

    public void createNewAccount() {
        User user = new User();
        user.input();
        list.add(user);
    }

    public void Startagain() {
        Menu menu = new Menu();
        menu.mainMenu();
        while (true) {
            try {
                int choose = scanner.nextInt();
                scanner.nextLine();
                switch (choose) {
                    case 1:
                        login();
                        break;
                    case 2:
                        createNewAccount();
                        Startagain();
                        break;
                    case 0:
                        System.exit(1);
                        break;
                }
                break;
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

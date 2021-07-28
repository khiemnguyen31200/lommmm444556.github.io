import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Function dfn = new Function();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long lua chon");
        System.out.println("1 - Chuan hoa ten");
        System.out.println("2 - Kiem tra email dung dinh dang khong");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                dfn.defineName();
                break;
            case 2:
                dfn.validate();
                break;
        }

    }
}

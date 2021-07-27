import java.util.Scanner;

public class Function {
    Scanner scanner = new Scanner(System.in);
    public void MainMenu() {
        Repository repository = new Repository();
        Menu.mainMenu();
        int choose = scanner.nextInt();
        if (choose >8){
            System.out.println("Vui lòng nhập lại");
            MainMenu();
        }
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("DANH SÁCH SẢN PHẨM");
                repository.show();
                break;
            case 2:
                System.out.println("Danh sách sản phẩm trên 10.000 VND");
                repository.filterProductByPrice();
                break;
            case 3:
                System.out.println("Danh sách sản phẩm bán được từ 50 trở lên");
                repository.countProductByAmountSale();
                break;
            case 4:
                repository.getProductByCategory();
                break;
            case 5:
                System.out.println("Danh sách sản phẩm theo số lượng bán được :");
                repository.sortProductByAmountSale();
                break;
            case 6:
                System.out.println("Sản phẩm được bán nhiều nhất là");
                repository.getProductMaxAmountSale();
                break;
            case 7:
                System.out.println("Danh sách sản phẩm theo tên ");
                repository.sortProductByName();
                break;
            case 8:
                SubMenu();
                break;
        }
    }

    public void SubMenu() {
        long id;
        Repository repository = new Repository();
        Menu.secondMenu();
       
        int choose = scanner.nextInt();
        if (choose >3){
            System.out.println("Vui lòng nhập lại");
            SubMenu();
        }
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Nhập vào id");
                id = scanner.nextLong();
                scanner.nextLine();
                repository.editProductById(id);
                break;
            case 2:
                System.out.println("Nhập vào id");
                id = scanner.nextLong();
                scanner.nextLine();
                repository.deleteProductById(id);
                break;
            case 3:
                MainMenu();
                break;
        }
    }
}
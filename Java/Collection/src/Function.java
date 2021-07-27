import java.util.Scanner;

public class Function {
    public void Start() {
        Scanner scanner = new Scanner(System.in);
        MenuList.Menubar();
        int choose = scanner.nextInt();
        ProductRepos productRepos = new ProductRepos();
        productRepos.addProduct();
        int id;
        switch (choose) {
            case 1:
                productRepos.showAllProduct();
                Start();
                break;
            case 2:
                productRepos.addNewProduct();
                Start();
                break;
            case 3:
                id = productRepos.checkNumber("ID");
                productRepos.editProductById(id);
                Start();
                break;
            case 4:
                id = productRepos.checkNumber("ID");
                productRepos.deleteProductById(id);
                Start();
                break;
            case 5:
                productRepos.getIdAndQuantitySold();
                Start();
                break;
            case 6:
                productRepos.getQuantityOfCategory();
                Start();
                break;
            case 7:
                System.exit(1);
                break;

        }
    }
}

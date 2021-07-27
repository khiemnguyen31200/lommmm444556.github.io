import java.util.Scanner;

public class Function {
    Scanner scanner = new Scanner(System.in);
    public void Start() {  
        MenuList.Menubar();
        int choose = scanner.nextInt();
        if (choose>7){
            System.out.println("Try again");
            System.out.println("Please enter number from 1 to 7 ");
            Start();
        }
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

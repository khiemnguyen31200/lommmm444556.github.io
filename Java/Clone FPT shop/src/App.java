import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        productReposetory Product = new productReposetory();
        Product.addProduct();
        System.out.println("Chào mừng bạn đến với FPT Shop");
        System.out.println("Bạn vui lòng chọn chức năng muốn thực hiên: ");
        Product.insert();
    }
}

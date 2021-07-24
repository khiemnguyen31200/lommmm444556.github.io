import java.util.Scanner;
import java.util.List;

public class productReposetory {

    List<product> productList;
   public void addProduct(enumGenerate category){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhập mã sản phẩm");
    String id = scanner.nextLine();
    System.out.println(("Nhập tên sản phẩm"));
    String name = scanner.nextLine();
    System.out.println("Nhập mô tả");
    String description = scanner.nextLine();
    System.out.println("Nhập giá");
    long price = scanner.nextLong();
    System.out.println("Nhập số lượng");
    int quantity = scanner.nextInt();
    System.out.println("Nhập số lượng được bán");
    int sellQuantity = scanner.nextInt();
    System.out.println("Nhập thương hiệu :");
    String brand = scanner.nextLine();
    productList.add(new product(id,name,description,price,quantity,sellQuantity,brand,category));
    System.out.println("Sản phẩm sau khi thêm");
    productList.forEach(System.out::println);

    
    
   }  
}

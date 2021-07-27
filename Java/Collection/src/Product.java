import java.text.DecimalFormat;
import java.util.Scanner;

public class Product {
    private int id ;
    private String productName ;
    private Category category;
    private int productQuantity ;
    private long price;
    private int sellQuantity;

  
    public Product(int id, String productName, Category category, int productQuantity, long price, int sellQuantity
            ) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.productQuantity = productQuantity;
        this.price = price;
        this.sellQuantity = sellQuantity;
        
    }
    public int getId() {
        return  id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getProductName() {
        return productName;
    }




    public void setProductName(String productName) {
        this.productName = productName;
    }




    public Category getCategory() {
        return category;
    }




    public void setCategory(Category category) {
        this.category = category;
    }




    public int getProductQuantity() {
        return productQuantity;
    }




    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }




    public long getPrice() {
        return price;
    }




    public void setPrice(long price) {
        this.price = price;
    }




    public int getSellQuantity() {
        return sellQuantity;
    }




    public void setSellQuantity(int sellQuantity) {
        this.sellQuantity = sellQuantity;
    }

    Scanner scanner = new Scanner(System.in);
    public Object getProduct;
    
    public void input() {
        ProductRepos  p = new ProductRepos();
        System.out.println("Input code of product");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input name of product");
        productName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Input category ");
        category = p.chooseCategory();
        scanner.nextLine();
        System.out.println("Input quantity ");
        productQuantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input sell quantity ");
        sellQuantity = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input price");
        price=scanner.nextLong();
        
    }

    

    
    public String formatNumber(long number) {
        DecimalFormat format = new DecimalFormat("###,###,##0.00 VND");
        return format.format(number);
    }
    
    public Product() {
    }

    @Override
    public String toString() {
        return id+" - "+productName+" - "+category+" - "+productQuantity+" - "+sellQuantity+" - "+formatNumber(price);
    }

    
    
}

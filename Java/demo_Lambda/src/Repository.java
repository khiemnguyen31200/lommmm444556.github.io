import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Product> listProducts;

    public Repository() {
        listProducts = new ArrayList<>();
        listProducts.add(new Product(1,"Áo","Quần cáo ",6,60000,5));
        
    }

    
}

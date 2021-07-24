public class Product{
    int id;
    String name;
    String productType;
    int amount;
    long price;
    int amountSale;
    public Product(int id, String name, String productType, int amount, long price, int amountSale) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.amount = amount;
        this.price = price;
        this.amountSale = amountSale;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public int getAmountSale() {
        return amountSale;
    }
    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }
    @Override
    public String toString() {
        return "Product [amount=" + amount + ", amountSale=" + amountSale + ", id=" + id + ", name=" + name + ", price="
                + price + ", productType=" + productType + "]";
    }
    
}
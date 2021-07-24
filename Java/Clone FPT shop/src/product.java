public class product {
    String id;
    String name;
    String description;
    long price;
    int quantity;
    int sellQuantity;
    String brand;
    enumGenerate category;
    // Constructor
    public product() {
    }
    public product(String id, String name, String description, long price, int quantity, int sellQuantity, String brand,
            enumGenerate category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.sellQuantity = sellQuantity;
        this.brand = brand;
        this.category = category;
    }
    // Get and set 
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiscription() {
        return description;
    }
    public void setDiscription(String discription) {
        this.description = discription;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getSellQuantity() {
        return sellQuantity;
    }
    public void setSellQuantity(int sellQuantity) {
        this.sellQuantity = sellQuantity;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public enumGenerate getCategory() {
        return category;
    }
    public void setCategory(enumGenerate category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "id=" + id  + ", category=" + category + ", discription=" + description + ", brand=" + brand
                + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", sellQuantity=" + sellQuantity
                + "]";
    }

   





    
}

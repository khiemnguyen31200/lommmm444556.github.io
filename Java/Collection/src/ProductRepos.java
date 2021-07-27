import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductRepos {
    Category category;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> repons;
    public void addProduct(){
        repons = new ArrayList<Product>();
        repons.add(new Product(01, "Soap", Category.COMESTIC, 20, 20000, 15));
        repons.add(new Product(02, "Clock", Category.HOMEWARE, 20, 120000, 15));
        repons.add(new Product(03, "Pencil", Category.OTHERS, 20, 25000, 15));     
    }
    public void showAllProduct(){
        System.out.println("List of product now ");
        repons.forEach(System.out::println);
    }
    
    public Category chooseCategory() {
        while (true) {
            try {
                MenuList.chooseCategory();
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        return category = Category.FOOD;
                        
                    case 2:
                        return category = Category.HOMEWARE;
                        
                    case 3:
                        return category = Category.COMESTIC;
                        
                    case 4:
                        return category = Category.FASHION;
                    case 5:
                        return category = Category.OTHERS;
                        
                    default:
                        throw new ArithmeticException();
                }
            } catch (ArithmeticException ex1) {
                System.out.println("Please enter the number around  1 to 4");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("Please enter the number around  1 to 4");
                continue;
            }
        }
    }
    public void addNewProduct(){
        System.out.println("Input number of product that you want to add: ");
        int choice = scanner.nextInt();
        for (int i = 0; i <choice; i++) {
            Product product = new Product();
            product.input();
            repons.add(product);
        }
        System.out.println("List of product after added: ");
        repons.forEach(System.out::println);
    }

    public int checkNumber(String request) {
        int number = 0;
        while (true) {
            try {
                System.out.println("Enter " + request + ": ");
                number = Integer.parseInt(scanner.nextLine());
                if (number < 0) {
                    throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println(request + " must be bigger than 0!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println(request + " must be a number !");
                continue;
            }
        }
        return number;
    }

    public void editProductById(int id) {
        int count = 0;
        for (int i = 0; i < repons.size(); i++) {
            if (repons.get(i).getId() == id) {
                System.out.println("Product you want to renew " + id + ": ");
                System.out.println(repons.get(i));
                System.out.println("Update product has product code is " + id + ": ");
                System.out.println("New name : ");
                String name = scanner.nextLine();
                int quantity = checkNumber("Quantity");
                long price = checkNumber("Price");
                int quantitySold = checkNumber("Sell Quantity");
                repons.set(i,new Product(id, name, chooseCategory(), quantity, price, quantitySold));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not exist");
        } else {
            System.out.println("\n List of product after updated: ");
            showAllProduct();
        }
    }

    public void deleteProductById(int id) {
        int count = 0;
        for (int i = 0; i < repons.size(); i++) {
            if (repons.get(i).getId() == id) {
                System.out.println("Product you want to delete has id is " + id + ": ");
                System.out.println(repons.get(i));
                repons.remove(repons.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not exist");
        } else {
            System.out.println("\n List of product after updated: ");
            showAllProduct();
        }
    }

    public void getIdAndQuantitySold() {
        
        Map<Integer, String> list = new HashMap<>();
        for (Product product : repons) {
            list.put(product.getId(), product.getProductName() + " - " + "Sold product: " + product.getProductQuantity());
        }

        for (Map.Entry<Integer, String> entry : list.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void getQuantityOfCategory() {
        Map<Category, Integer> list = new HashMap<>();
        for (Product product : repons) {
            if (!list.containsKey(product.getCategory())) {
                list.put(product.getCategory(), product.getProductQuantity());
            } else {
                list.put(product.getCategory(), list.get(product.getCategory()) + product.getProductQuantity());
            }
        }
        for (Map.Entry<Category, Integer> entry : list.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "product");
        }
    }
}

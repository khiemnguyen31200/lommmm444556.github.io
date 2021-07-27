import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Repository {
    Category category;
    Function fn = new Function();
    List<Product> listProducts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Repository() {
        listProducts.add(new Product(1, "Bánh Doraemon 3 vị", Category.FOOD, 100, 3500, 57));
        listProducts.add(new Product(2, "Xúc xích sườn non", Category.FOOD, 150, 3500, 12));
        listProducts.add(new Product(3, "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product(4, "Bánh khoai môn", Category.FOOD, 200, 42000, 78));
        listProducts.add(new Product(5, "Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE, 50, 8000, 4));
        listProducts.add(new Product(6, "Bát đựng gia vị", Category.HOUSEWARE, 65, 4000, 44));
        listProducts
                .add(new Product(7, "Nước Hoa Hồng Soothing Facial Toner Simple", Category.COSMETICS, 140, 92000, 88));
        listProducts.add(new Product(8, "Combo gội xả HAIRBURST", Category.COSMETICS, 100, 639000, 7));
        listProducts.add(new Product(9, "Tinh chất dưỡng ẩm sâu Klairs Rich Moist Soothing Serum", Category.COSMETICS,
                50, 249000, 24));
        listProducts.add(new Product(10, "Kem dưỡng thể Paula’s Choice RESIST WEIGHTLESS BODY TREATMENT",
                Category.COSMETICS, 80, 715000, 63));
        listProducts.add(new Product(11, "Áo thun TSUN", Category.FASHION, 250, 320000, 146));
    }

    public void show() {
        listProducts.forEach(System.out::println);
    }

    public void sortProductByName() {
        listProducts.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void filterProductByPrice() {
        listProducts.stream().filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSale() {
        long count = listProducts.stream().filter(product -> product.getAmountSale() >= 50).count();

        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: " + count);
    }

    public void getProductByCategory() {
        Map<Category, Long> list = new HashMap<>();
        for (Product product : listProducts) {
            if (!list.containsKey(product.getCategory())) {
                list.put(product.getCategory(), product.getAmount());
            } else {
                list.put(product.getCategory(), list.get(product.getCategory()) + product.getAmount());
            }
        }
        for (Map.Entry<Category, Long> entry : list.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " products");
        }
        System.out.println("Xem chi tiết từng danh mục");
        while (true) {
            try {
                Menu.chooseCategory();
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        getProductByEachCatogory("Food", Category.FOOD);
                        break;
                    case 2:
                        getProductByEachCatogory("House ware", Category.HOUSEWARE);
                        break;
                    case 3:
                        getProductByEachCatogory("Cosmetics", Category.COSMETICS);
                        break;
                    case 4:
                        getProductByEachCatogory("Fashion", Category.FASHION);
                        break;
                    case 5:
                        getProductByEachCatogory("Others", Category.OTHERS);
                        break;
                    default:
                        throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println("Lựa chọn của bạn không tồn tại, vui lòng nhập lại!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println("lựa chọn phải là số từ 1 đến 5, vui lòng nhập lại!");
                continue;
            }
        }
    }

    public void getProductByEachCatogory(String infor, Category category) {
        System.out.println("Danh sách " + infor + ": ");
        listProducts.stream().filter(product -> product.getCategory().equals(category))
                .forEach(product -> System.out.println(product));
    }

    public void sortProductByAmountSale() {
        listProducts.sort((o1, o2) -> ((o1.getAmountSale() > o2.getAmountSale()) ? 1 : -1));
    }

    public void getProductMaxAmountSale() {
        sortProductByAmountSale();
        long maxAmountSale = listProducts.get(listProducts.size() - 1).getAmountSale();
        listProducts.stream().filter(product -> (product.getAmountSale() == maxAmountSale))
                .forEach(product -> System.out.println(product));
    }

    public long checkNumber(String request) {
        long number = 0;
        while (true) {
            try {
                System.out.println("Nhập " + request + ": ");
                number = Long.parseLong(scanner.nextLine());
                if (number < 0) {
                    throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException ex1) {
                System.out.println(request + " không được nhỏ hơn 0!");
                continue;
            } catch (NumberFormatException ex2) {
                System.out.println(request + " phải là 1 số!");
                continue;
            }
        }
        return number;
    }

    public Category chooseCategory() {
        while (true) {

            while (true) {
                try {
                    Menu.chooseCategory();
                    int choose = Integer.parseInt(scanner.nextLine());
                    switch (choose) {
                        case 1:
                            return category = Category.FOOD;
                        case 2:
                            return category = Category.HOUSEWARE;
                        case 3:
                            return category = Category.COSMETICS;
                        case 4:
                            return category = Category.FASHION;
                        case 5:
                            return category = Category.OTHERS;
                        default:
                            throw new ArithmeticException();
                    }
                } catch (ArithmeticException ex1) {
                    System.out.println("Please enter the number around  1 to 5");
                    continue;
                } catch (NumberFormatException ex2) {
                    System.out.println("Please enter the number around  1 to 5");
                    continue;
                }
            }
        }
    }

    public void editProductById(long id) {
        int count = 0;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                System.out.println("Nhập mã sản phẩm muốn thay đổi " + id + ": ");
                System.out.println(listProducts.get(i));
                System.out.println("Thay đổi sản phẩm có id là " + id + ": ");
                System.out.println("Tên mới : ");
                String name = scanner.nextLine();
                long quantity = checkNumber("Số lượng");
                long price = checkNumber("Giá ");
                long quantitySold = checkNumber("Số lượng bán");
                listProducts.set(i, new Product(id, name, chooseCategory(), quantity, price, quantitySold));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tồn tại");
        } else {
            System.out.println("\n Danh sách sản phẩm sau khi cập nhật ");
            show();
        }
        fn.SubMenu();
    }

    // xóa sản phẩm theo id:
    public void deleteProductById(long id) {
        int count = 0;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                System.out.println("Sản phẩm bạn muốn xóa có mã id là : " + id);
                System.out.println(listProducts.get(i));
                listProducts.remove(listProducts.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tồn tại");
        } else {
            System.out.println("\nDanh sách sản phẩm sau khi cập nhật ");
            show();
        }
        fn.SubMenu();
    }
    
}

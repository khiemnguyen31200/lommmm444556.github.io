
import java.util.ArrayList;
import java.util.Scanner;

public class productReposetory {
    Scanner scanner = new Scanner(System.in);
    ArrayList<product> productList;
    ArrayList<product> listByCategory;

    public void addProduct() {
        productList = new ArrayList<>();
        productList.add(new product("1", "SamSung", "S21 Ultra", 22000000, 10, 8, "SamSung", enumGenerate.PHONE));
        productList.add(new product("2", "SamSung", "S20 Ultra", 20000000, 10, 8, "SamSung", enumGenerate.PHONE));
        productList.add(new product("3", "SamSung", "S10 Plus", 9000000, 10, 8, "SamSung", enumGenerate.PHONE));
        productList.add(new product("4", "SamSung", "S9 Plus", 5000000, 10, 8, "SamSung", enumGenerate.PHONE));
        productList.add(new product("5", "SamSung", "S9 ", 4500000, 10, 8, "SamSung", enumGenerate.PHONE));
        productList.add(new product("6", "SamSung", "A10", 3200000, 10, 8, "SamSung", enumGenerate.PHONE));
        productList.add(new product("7", "SamSung", "A70", 8000000, 10, 8, "SamSung", enumGenerate.PHONE));
        productList.add(new product("8", "Xiaomi", "Mi note book", 9400000, 10, 8, "Xiaomi", enumGenerate.LAPTOP));
        productList.add(new product("9", "Xiaomi", "Power storage 20000 Mah", 800000, 10, 8, "Xiaomi",
                enumGenerate.ASSOCERIES));
        productList.add(new product("10", "Xiaomi", "Power storage 30000 Mah", 1000000, 10, 8, "Xiaomi",
                enumGenerate.ASSOCERIES));
        productList.add(
                new product("11", "Xiaomi", "Wireless charge ", 300000, 14, 12, "Xiaomi", enumGenerate.ASSOCERIES));
        productList.add(new product("12", "Apple", "Iphone 12 ", 20000000, 25, 23, "Apple", enumGenerate.APPLE));
        productList.add(new product("13", "Apple", "Mac mini", 18000000, 10, 8, "Apple", enumGenerate.APPLE));
        productList.add(new product("14", "Apple", "Imac 24 inch", 28000000, 10, 8, "Apple", enumGenerate.APPLE));
        productList.add(new product("15", "Apple", "Iphone 12 Pro max", 28000000, 10, 8, "Apple", enumGenerate.APPLE));
        productList.add(new product("16", "Apple", "Iphone 11", 15000000, 10, 8, "Apple", enumGenerate.APPLE));
        productList.add(new product("17", "Macbook pro", "2020", 45000000, 10, 8, "Apple", enumGenerate.LAPTOP));
        productList.add(new product("18", "Dell", "Xps 13", 35000000, 10, 8, "Dell", enumGenerate.LAPTOP));
        productList.add(new product("19", "Asus", "Zenfyrus", 38000000, 10, 8, "Asus", enumGenerate.LAPTOP));
        productList.add(new product("20", "Apple", "Macbook Air", 25000000, 10, 8, "Apple", enumGenerate.LAPTOP));
        productList.add(new product("21", "Apple", "Macbook pro 16", 55000000, 10, 8, "Apple", enumGenerate.LAPTOP));
    }

    public void printAllProduct() {
        System.out.println("Danh sách toàn bộ sản phẩm là: ");
        productList.forEach(System.out::println);
        insert();
    }

    public void GetProductbycategory() {
        Menu menu = new Menu();
        menu.chooseCategory();
        System.out.println("Vui lòng lựa chọn");
        int choose = scanner.nextInt();
        if (choose > 4) {
            System.out.println("Vui lòng chọn lại");
            menu.chooseCategory();
            choose = scanner.nextInt();
        }
        System.out.println("Danh sách sản phẩm theo danh mục bạn đã chọn");
        switch (choose) {
            case 1:
                listByCategory = new ArrayList<>();
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getCategory().equals(enumGenerate.PHONE)) {
                        listByCategory.add(productList.get(i));
                    }
                }
                listByCategory.forEach(System.out::println);
                break;
            case 2:
                listByCategory = new ArrayList<>();
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getCategory().equals(enumGenerate.LAPTOP)) {
                        listByCategory.add(productList.get(i));
                    }
                }
                listByCategory.forEach(System.out::println);
                break;
            case 3:
                listByCategory = new ArrayList<>();
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getCategory().equals(enumGenerate.APPLE)) {
                        listByCategory.add(productList.get(i));
                    }
                }
                listByCategory.forEach(System.out::println);
                break;
            case 4:
                listByCategory = new ArrayList<>();
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getCategory().equals(enumGenerate.ASSOCERIES)) {
                        listByCategory.add(productList.get(i));
                    }
                }
                listByCategory.forEach(System.out::println);
                break;

        }

    }

    public void getProductByCategoryAndPrice() {
        Scanner sc = new Scanner(System.in);
        Menu.choosePrice();
        System.out.print("Lựa chọn của bạn: ");
        int choose = sc.nextInt();
        if (choose > 4) {
            System.out.println("Vui lòng chọn lại");
            Menu.choosePrice();
            choose = scanner.nextInt();
        }
        sc.nextLine();
        int count = 0;
        switch (choose) {
            case 1:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getPrice() < 2000000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getPrice() >= 2000000 && listByCategory.get(i).getPrice() < 4000000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getPrice() >= 4000000 && listByCategory.get(i).getPrice() < 7000000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getPrice() >= 7000000 && listByCategory.get(i).getPrice() < 13000000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
            case 5:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getPrice() > 13000000) {
                        System.out.println(listByCategory.get(i).toString());
                        count++;
                    }
                }
                break;
        }
        System.out.println((count == 0) ? "Không có sản phẩm này" : "");
        insert();
    }

    public void GetProductbyBrand() {
        Scanner sc = new Scanner(System.in);
        Menu.chooseBrand();
        System.out.print("Lựa chọn của bạn: ");
        int choose = sc.nextInt();
        if (choose > 4) {
            System.out.println("Vui lòng chọn lại");
            Menu.chooseBrand();
            choose = scanner.nextInt();
        }
        sc.nextLine();
        int count = 0;
        switch (choose) {
            case 1:
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getBrand() == "SamSung") {
                        System.out.println(productList.get(i).toString());
                        count++;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getBrand() == "Dell") {
                        System.out.println(productList.get(i).toString());
                        count++;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getBrand() == "Apple") {
                        System.out.println(productList.get(i).toString());
                        count++;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).getBrand() == "Xiaomi") {
                        System.out.println(productList.get(i).toString());
                        count++;
                    }
                }
                break;
        }
        System.out.println((count == 0) ? "Không có sản phẩm này" : "");
        insert();

    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập mô tả sản phẩm");
        String descriptionType = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getDiscription().contains(descriptionType)) {
                System.out.println(productList.get(i).toString());
                count++;
            }
        }
        System.out.println((count == 0) ? "Không có sản phẩm này" : "");
        insert();

    }

    public void insert() {
        Menu menu = new Menu();
        menu.chooseMenubar();
        System.out.println("Lựa chọn của bạn: ");
        int selectMenu = scanner.nextInt();
        if(selectMenu>4){
            System.out.println("Vui lòng chọn lại ");
            selectMenu = scanner.nextInt();
        }
        switch (selectMenu) {
            case 1:
                printAllProduct();
                break;
            case 2:
                GetProductbyBrand();
                break;
            case 3:
                GetProductbycategory();
                getProductByCategoryAndPrice();
                break;
            case 4:
                search();
                break;
            
        }

    }

}

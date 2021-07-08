import java.util.Scanner;

public class person {
    String name;
    int age;
    String address;

    @Override
    public String toString() {
        return name+" - "+ age+" - "+ address;
    }

    public void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên");
        name = sc.nextLine();

        
        System.out.println("Nhập tuổi");
        age = sc.nextInt();
        sc.nextLine();

        
        System.out.println("Nhập địa chỉ");
        address = sc.nextLine();
        sc.nextLine();
    }
}

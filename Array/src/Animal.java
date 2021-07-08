import java.util.Scanner;

public class Animal {
    Scanner sc = new Scanner(System.in);
    String nameAni;
    String color;
    int numOfFoot;

    public Animal(String nameAni, String color, int numOfFoot) {
        this.nameAni = nameAni;
        this.color = color;
        this.numOfFoot = numOfFoot;
    }

    public void input(){
        System.out.println("Nhập vào tên động vật");
        nameAni = sc.nextLine();
        sc.nextLine();

        System.out.println("Nhập vào màu lông");
        color = sc.nextLine();
        sc.nextLine();

        System.out.println("Nhập vào số chân");
        numOfFoot = sc.nextInt();

    }
    public Animal() {
    }

    @Override
    public String toString() {
        return nameAni + " - " + color + " - " + numOfFoot;

    }
}

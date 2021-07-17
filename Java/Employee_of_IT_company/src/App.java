import java.util.ArrayList;
import java.util.Scanner;

public class App {
       public static void main(String[] args) throws Exception {
        // Nhập số lượng người cần thêm vào team
        System.out.println("Nhập vào số lượng nhân viên muốn thêm vào team Coder");
        Scanner scanner = new Scanner(System.in);
        int numberofcoders= scanner.nextInt();
        System.out.println("Nhập vào số lượng nhân viên muốn thêm vào team Checker");
        int numberofchecker= scanner.nextInt();
        //Team coder
        System.out.println("Coder team");
        ArrayList<Coder> coderList = new ArrayList<>();
        for (int i = 0; i <numberofcoders;i++){
        System.out.println("Nhập vào nhân viên thứ "+(i+1));
        Coder coder=new Coder();
        coder.input();
        coderList.add(coder);
        }
        System.out.println("Danh sách Coder team");
        for (Coder coder : coderList) {
            System.out.println(coder);
        }
        //Team checker
        System.out.println("Checker team");
        ArrayList<Checker> checkerList = new ArrayList<>();
        for (int i = 0; i <numberofchecker;i++){
        System.out.println("Nhập vào nhân viên thứ "+(i+1));
        Checker checker = new Checker();
        checker.input();
        checkerList.add(checker);
        }
        System.out.println("Danh sách Checker team");
        for (Checker checker : checkerList) {
            System.out.println(checker);
        }


    }
}

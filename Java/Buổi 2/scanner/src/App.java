import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Nhập tên ");
        // String Name = sc.next();
        String Name1 = sc.nextLine();
        System.out.println("Nhập tuổi ");
        int tuoi = sc.nextInt();
        String s = (tuoi>=18) ? "Được phép bầu cử" : "không được bầu cử" ;
        System.out.println(s);
        // System.out.println(Name);
        System.out.println(Name1);
        System.out.println(tuoi);

        // Xử lí trôi lệnh
        // Cách 1 
        // sc.nextLine();
        //Cách 2
        // double pt = Double.valueOf(sc.nextInt());
        // Cách 2
        // double pts = Double.parseDouble(sc.nextLine());

        // các dang của printf
        System.out.printf("tôi tên là %s"+ "năm nay tôi %d",Name1,tuoi);

    }
}

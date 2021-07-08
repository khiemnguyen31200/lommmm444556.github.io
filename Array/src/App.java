import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];// tạo mảng có kích thước là 5
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 5;
        arr[3] = 15;
        arr[4] = 12;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[2] = 6;

        System.out.println("Mảng sau khi sửa");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Phần tử đầu tiên là " + arr[0]);

        // Mảng kiểu chuỗi
        String[] arrstr = new String[5];
        arrstr[0] = "Java";
        arrstr[1] = "HTML";
        arrstr[2] = "Python";
        arrstr[3] = "Ruby";
        arrstr[4] = "PHP";

        for (int i = 0; i < arrstr.length; i++) {
            System.out.println(arrstr[i]);
        }

        System.out.println(arrstr[0].endsWith("a")); // Kiểm tra trong phần tử đầu tiên có kết thúc bởi kí tự "a" hay
                                                     // không

        String Name = "Nguyễn Hòa Khiêm ";
        Name = Name.trim();
        String arrayName[] = Name.split("\s+");
        System.out.println(Name+arrayName);
        // String arrName = Name.split("\s"));

        // for (int i = 0; i < arrName.length; i++) {
        // System.out.println(arrName[i]);
        // }

        // Tính tổng các phần tử trong dãy
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        // }
        // System.out.println("Tổng của dãy là");
        // System.out.println(sum);

        // Nhập vào 1 mảng và thực hiện một số yêu cầu
        System.out.println("Vui lòng nhập kichs thước mảng");
        int size = sc.nextInt();
        int [] arr02 = new int[size];
        sc.nextLine();
        for(int i = 0; i < arr02.length; i++) {
            System.out.println("Nhập phần tử thứ : " + i);
            arr02[i] =sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Dãy số đã nhập là " );
        for(int i =0;i< arr02.length; i++){
            System.out.println(arr02[i]);
        }

        // Sắp xếp các số theo thứ tự tăng dần
        for (int i = 0; i < arr02.length; i++) {
            for (int j = i + 1; j < arr02.length; j++) {
                if (arr02[i] > arr02[j]) {
                    int temp = arr02[i];
                    arr02[i] = arr02[j];
                    arr02[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là");
        for (int i = 0; i < arr02.length; i++) {
            System.out.println(arr02[i]);
        }
        //Tính tổng số chẵn
        int sum1 = 0;
        for (int i = 0; i < arr02.length; i++) {
            if (arr02[i] % 2 == 0) {
                sum1 = sum1 + arr02[i];
            }
        }
        System.out.println("Tổng số chẵn của dãy là");
        System.out.println(sum1);
        
        System.out.println("Nhập số mảng cần nhập");
        int nn = sc.nextInt();
        person[] arPersons = new person[nn];// Khởi tạo mảng
    
        for (int i = 0; i < arPersons.length; i++) {
            person person = new person();// Tạo đối tượng
            person.input();// Nhập thông tin truy cập hàm input bên tab person
            arPersons[i] = person;   // Gán mảng ở vị trí i cho đối tượng person
        }
        
        for(int i =0; i<arPersons.length; i++) {
            System.out.println(arPersons[i]);
        }

        // Sử dụng for each

         System.out.println("sử dụng for each ");
        for (person p :arPersons){
            System.out.println(p);
        }
    }
}

// Tạo phương thức để in thông tiên
// public static void show(int arr[]){
// for(int i =0; )

//

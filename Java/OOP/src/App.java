import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Person ps = new Person("John",25,"Hn");// Tạo đối tượng Person
        // System.out.println(ps.toString());

        // Person ps2 = new Person();
        // ps2.input();
        // System.out.println(ps2.toString());

        // Student[] student = new Student[1];// Khởi tạo mảng có kic thước = 
        // for (int i = 0; i < student.length; i++) {
        //     System.out.println("Sinh viên thứ " + (i+1));
        //     Student std =new Student();
        //     std.input();
        //     student[i]=std;
        // }
        // for (int i = 0; i < student.length; i++) {
        //     System.out.println(student[i].toString());
        // }

        ArrayList<String> listname = new ArrayList<>();
        listname.add("Khiêm");// thêm một cái gì đó
        listname.add("Khiêm");// thêm một cái gì đó
        listname.add("Khiêm");// thêm một cái gì đó
        listname.add("Khiêm");// thêm một cái gì đó

        for (String s : listname) {
            System.out.println(s);
        }

        listname.add("Khiêmnn");
        System.out.println("Sau khi thêm :");
        for (String s : listname) {
            System.out.println(s);
        }

        System.out.println("Sau khi chèn");
        listname.add(1,"Khiêmn");// chèn thêm vào
        for (String s : listname) {
            System.out.println(s);
        }

        System.out.println("Sau khi sửa");
        listname.set(1,"111");// sủa mảng
        for (String s : listname) {
            System.out.println(s);
        }

        System.out.println("số phần tử trong mảng" + listname.size());
        

        boolean isCheck = listname.contains("Khiêm");// kiểm tra trong danh sách có tên Khiêm không
        System.out.println(isCheck);

        System.out.println("Khiêm nằm ở cuối cùng danh sách là bao nhiêu : " + listname.lastIndexOf("Khiêm"));// In ra thứ tự của chuỗi "Khiêm cuối cùng"
        System.out.println("Vị trí thứ 3 có kí tự là " + listname.get(3));// tìm phần tử ở vị trí

        listname.clear(); // Xóa các phần tử trong dãy


        // Quản lí bài trên bằng arrayList

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích cỡ mảng");
        int n = sc.nextInt();
        ArrayList<Student> listStudents = new ArrayList<>(3);
        for(int i=0; i <n;i++){
            Student student = new Student();
            System.out.println("Nhập thông tin học sinh thử " + (i+1));
            student.input();
            listStudents.add(student);
            
        }
        System.out.println("Danh sách sinh viên");
        for(Student student : listStudents){
            System.out.println(student);
        }
        

        // Xóa thông thông tin 1 người 

        System.out.println("Nhập tên muốn tìm kiếm");
        String name = sc.nextLine();
        for(int i=0;i< n;i++){
            if(listStudents.get(i).getName().equals(name)){
                listStudents.remove(listStudents.get(i));
            }
        }

        System.out.println("Danh sách sau khi xóa");
        for(Student student : listStudents){
            System.out.println(student);
        }
    }
}

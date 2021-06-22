public class App {
    public static int max =100;
    public static void main(String[] args) throws Exception {
       int number =10 ;
       // Cách khai báo khác
       int so  ;
       so = 100; 
       // Kiểu biến long nền thêm L vào đằng sau để phân biệt với các kiểu biến khác
       long lNum = 100L;

       // Kiểu biến số thực
       float fNum = 5.5f;
       double dNum =6.6d;

       // kiểu biến char
       char ch = 'a';
       char ch1 = '1';
       // kí tự gạch ngang-theo số thứ tự
       char ch2 = 45;
       //Kiểu dữ liệu Boolean - giá trị mặc định của boolean là false
       boolean isCheck = true;


 
       System.out.println(number+so);
       System.out.println(lNum);
       System.out.println(fNum);
       System.out.println(dNum);
       System.out.println(ch + "-" + ch1 + "-" + ch2);
       System.out.println(isCheck);
       System.out.println(max);

       App ap = new App();// tạo đối tượng mới
       ap.introduceMyself();

       //tao đối tượng của p - thừa kế từ class Person 
       //<Tên class> < Tên biến tham chiếu - tự tạo > = new <Tên class>
       Person p = new Person();
       p.getAge();// Gọi tới phương thức getAge
       p.increaseAge();// Gọi đên phương thức increaseAge

       Calculate cal = new Calculate();
       // in ra kết quả trong phương thức 
       System.out.println(cal.add());
       System.out.println(cal.minuss());
       System.out.println(cal.div());

        // Tạo String 
    String str ="A B C D";
    String str2 ="a b c d";
    System.out.println("Các kí tự là "+ str);

    int length = str.length();// lấy kích thước chuỗi
    System.out.println(" Kích thước chuỗi là " + length);
    System.out.println(str.toLowerCase());// Viết thường toàn bộ chữ
    System.out.println(str.toUpperCase());// Viết hoa toàn bộ chữ
    System.out.println(str.trim());// Loai bỏ khoảng trắng ở đầu và cuối chuỗi
    System.out.println(str.equals(str2));// So sánh toàn bộ
    System.out.println(str.equalsIgnoreCase(str2));// Chỉ so sánh kí tự 

    }
    // không muốn tạo đối tượng sử dụng static 
 public void introduceMyself(){
     //void phương thức không trả về gì cả
     // quy tắc Camel case
     System.out.println("12345");
 }

}

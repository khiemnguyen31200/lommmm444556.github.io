import java.util.Scanner;

public class Student extends Teacher {
    String name;
    int age;
    String address;
    Double DQT;
    Double DKT;
    int id;
    static String school = "Techmaster";
    Scanner sc = new Scanner(System.in);
    public Student() {
    }

    public void input(){
        System.out.println("nhập tên");
        name = sc.nextLine();
        System.out.println("Nhập id");
        id = sc.nextInt();
        System.out.println("nhập tuổi");
        age = sc.nextInt();
        System.out.println("nhập địa chỉ");
        address = sc.nextLine();
        sc.nextLine();
        System.out.println("nhập điểm quá trình");
        DQT = sc.nextDouble();
        System.out.println("nhập điểm kết thúc");
        DKT = sc.nextDouble();  
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getDQT() {
        return DQT;
    }

    public void setDQT(Double dQT) {
        DQT = dQT;
    }

    public Double getDKT() {
        return DKT;
    }

    public void setDKT(Double dKT) {
        DKT = dKT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double avgPoint(){
        return (DQT+DKT)/2;
    }
    @Override
    public String toString() {
         return name + "-" + age + "-" + address + "-" + school + " - " + "Điểm kết thúc" + "-" + avgPoint() ;
    }
}

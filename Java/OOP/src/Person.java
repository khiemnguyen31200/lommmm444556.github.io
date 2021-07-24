import java.util.Scanner;

public class Person {
    String name;
    int age;
    String address;
    Double DQT;
    Double DKT;
    static String school = "Techmaster";
    Scanner sc = new Scanner(System.in);

    // static void setschool(){
    // school = "CNTT";
    // }

    // Tạo phương thức

    public void study(String sub) {
        System.out.println(name + " study " + sub);
    }

    public Person() {
    }



    public void show() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(school);

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

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Person.school = school;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    // Constructer
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    @Override
    public String toString() {
        Double Point = (DQT+DKT) / 2; 
        return name + "-" + age + "-" + address + "-" + school + " - " + "Điểm kết thúc" + "-" + Point ;
    }

}
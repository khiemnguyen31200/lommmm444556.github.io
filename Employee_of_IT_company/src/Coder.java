import java.util.Scanner;

public class Coder extends Employee {
    int overTime;

    public Coder(int id, String name, int age, String phoneNumber, String email, long salary, int overTime) {
        super(id, name, age, phoneNumber, email, salary);
        this.overTime = overTime;
    }

     
    public Coder() {
    }


    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào tên");
        name= scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập vào tuổi");
        age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập vào số điện thoại");
        phoneNumber = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập vào email");
        email = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập vào mức lương");
        salary= scanner.nextLong();
        scanner.nextLine();
        System.out.println("Nhập vào số giwof overTime");
        overTime=scanner.nextInt();
    }
    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    @Override
    public long SalaryofEmployee() {

        return salary + overTime * 200000;
    }
    @Override
    public String toString() {
        return super.toString()+"-"+overTime+"-"+SalaryofEmployee();
    }
    

}
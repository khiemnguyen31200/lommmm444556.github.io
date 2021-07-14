import java.util.Scanner;

public class Checker extends Employee{
    int incorrectlyChecked ;


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
        System.out.println("Nhập vào số lỗi phát hiện");
        incorrectlyChecked=scanner.nextInt();

        
    }


    public Checker() {
    }


    public int getIncorrectlyChecked() {
        return incorrectlyChecked;
    }


    public Checker(int id, String name, int age, String phoneNumber, String email, long salary,
            int incorrectlyChecked) {
        super(id, name, age, phoneNumber, email, salary);
        this.incorrectlyChecked = incorrectlyChecked;
    }


    public void setIncorrectlyChecked(int incorrectlyChecked) {
        this.incorrectlyChecked = incorrectlyChecked;
    }


    @Override
    public long SalaryofEmployee() {
        return salary+incorrectlyChecked*50000 ;
    }


    @Override
    public String toString() {
        return super.toString()+"-"+incorrectlyChecked+"-"+SalaryofEmployee();
    }
    
}

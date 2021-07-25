import java.util.Scanner;

public class Access {
    public void totalInsert() {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        System.out.println("Vui lòng nhập vào số theo yêu cầu");
        int choose = scanner.nextInt();
        if (choose > 3) {
            System.out.println("Vui lòng nhập lại :");
            choose = scanner.nextInt();
        }
        switch (choose) {
            case 1:
                TextBook text = new TextBook();
                text.insert();
                break;
            case 2:
                Project project = new Project();
                project.insert();
                break;
            case 3:
                DigitalDocument digital = new DigitalDocument();
                digital.insert();
                break;

        }

    }
    public void showMenu(){
        System.out.println("Vui lòng chọn trong các yêu cầu sau");
        System.out.println("1: Thêm sách giáo khoa");
        System.out.println("2: Thêm đồ án");
        System.out.println("3: Thêm tài liệu điện tử");
    } 
}

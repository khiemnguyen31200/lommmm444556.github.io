import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 5;
        if (a > b) {
            System.out.println("Sai");
        } else if (a < b) {
            System.out.println("Đúng");
        } else {
            System.out.println("Không rõ");
        }
        System.out.println("Finished");

        // Hai kiểu này khai báo có sự khác biệt
        String s1 = "java";
        String s2 = new String("java");
        // So sánh các kí tự
        if (s1.equals(s2)) {
            System.out.println("Hai chuỗi giống nhau");
        } else {
            System.out.println("Hai chuỗi khác nhau");
        }
        // So sánh địa chỉ
        if (s1 == s2) {
            System.out.println("Hai chuỗi giống nhau");
        } else {
            System.out.println("Hai chuỗi khác nhau");
        }
        // Hai điều kiện if lồng nhau
        if (a <= b) {
            if (a == b) {
                System.out.println("Giá trị có kết quả là" + b);
            }
        }
        /*
         * Ví dụ sử dụng vòng lặp if else và switch (key) { case value:
         * 
         * break;
         * 
         * default: break; }
         */
        // Sử dung if - else
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kì");
        int num = sc.nextInt();

        if (num == 5) {
            System.out.println("Số bạn vừa nhập là 5");
        } else if (num == 10) {
            System.out.println("Số bạn vừa nhập là 10");
        } else {
            System.out.println("bạn vừa nhập một số");
        }
        // Sử dụng switch - case
        switch (num) {
            case 5:
                System.out.println("Đây là số 5");
                break;
            case 10:
                System.out.println("Đây là số 10");
                break;
            default:
                System.out.println("Bạn đã nhập vào một số");
                break;
        }
        int month = sc.nextInt();
        if (month > 0 && month < 13) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(" Tháng này có 31 ngày");
                    break;
                case 2:
                    System.out.println(" Tháng này có 28 hoặc 29 ngày tùy vào từng năm");
                    break;
                default:
                    System.out.println(" Tháng này có 30 ngày");
                    break;
            }
        }

        // Sử dụng vòng lặp
        // in ra 11 số từ 0 đến 10

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // Vòng lặp while
        int number = 0;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }

        boolean ischeck = true;
        while (ischeck) {
            if (10 % 2 == 0) {
                System.out.println("Hello");
                ischeck = false;
            } else {
                System.out.println("Goodbye");
                ischeck = true;
            }
        }

        // Nhập mọt số nguyên dương
        // System.out.println("Nhập số bất kì");
        // int num1 = sc.nextInt();
        // while (num1 <= 0) {
        // System.out.println("Vui lòng nhập lại");
        // num1 = sc.nextInt();
        // }
        // System.out.println("Số bạn vừa nhập là " + num1);
        // Vòng lặp do while nếu vòng lặp sai thì vẫn sẽ lặp lại ít nhất một lần

        // do {
        // System.out.println("Vui lòng nhập lại :");
        // num1 = sc.nextInt();
        // }while (num1>0);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        String str = "Hello";

    for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
    }
    System.out.println("---------");
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Đếm chữ e

        String str = "Hello every one";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println(count);

        // Nhập 1 chuỗi bất kỳ và kiểm tra xem chuỗi đó có là chuỗi palindrome không ?

        String str1;
        char char1;
        int count9 = 0;

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        str1 = sc.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            char1 = str1.charAt(str1.length() - i - 1);
            if (str1.charAt(i) != char1) {
                count9++;
            } 
        }
        if (count9 == 0) {
            System.out.println("Chuỗi này là chuỗi Panlyndrome.");
        }else{
            System.out.println("Chuỗi này không phải là chuỗi Panlyndrome.");
        }
    }
}

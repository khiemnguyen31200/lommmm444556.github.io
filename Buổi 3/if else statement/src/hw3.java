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

        // Nhap vao mot chu kiem tra xem chung co phai so nguyen to khong

        int number;
        int count1=0;
        number =sc.nextInt();

        if(number <=1){
            System.out.println("Đây không phải là số nguyên tố");
            
        }else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%2==0||number%3==0||number%5==0||number%7==0){
                    count1++;
                }
            }
            if (count1==0){
                System.out.println("Đây là số nguyên tố");
            }else{
                System.out.println("Đây không phải là số nguyên tố");
            }
        }
    }
}

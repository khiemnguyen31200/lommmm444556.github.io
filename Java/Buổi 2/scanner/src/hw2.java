import java.util.Scanner;
public class hw2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

// Tính toán cạnh huyền sử dụng định lí Pythagore
        System.out.println("Nhập vào giá trị của cạnh góc vuông 1 " );
        float a = sc.nextFloat();
        System.out.println("Nhập vào giá trị của cạnh góc vuông 2 " );
        float b = sc.nextFloat();
        System.out.printf("Cạnh huyên có kết quả là : %.1f \n ",Math.sqrt(Math.pow(a,2)+Math.pow(b, 2)));
// Tính toán chỉ số BMI
        System.out.println("Nhập vào giá trị của cân nặng (Kg)" );  
        float c = sc.nextFloat();
        System.out.println("Nhập vào giá trị của cân nặng (m)" );  
        float d = sc.nextFloat();
        double bmi = c/Math.pow(d, 2);
        if(bmi < 18.5){
            System.out.printf("Chỉ số BMI của bạn là %.1f \n",bmi );
            System.out.println("Thiếu cân");
        }else if (bmi >=18.5 && bmi<=24.9){
            System.out.printf("Chỉ số BMI của bạn là %.1f \n",bmi );
            System.out.println("Cân đối");
        }else {
            System.out.printf("Chỉ số BMI của bạn là %.1f \n",bmi );
            System.out.println("Thừa cân");
        }


    }
}

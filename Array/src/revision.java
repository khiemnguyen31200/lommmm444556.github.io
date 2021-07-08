import java.time.LocalDate;
import java.util.Scanner;

public class revision {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // String Name = sc.nextLine();
        // Name = Name.toLowerCase().trim().replaceAll("\s+", " ");
        // String newName = new String();

        // String arrName[] = Name.split("\s+");
        // for (int i = 0; i < arrName.length; i++) {
        // newName += String.valueOf(arrName[i].charAt(0)).toUpperCase() +
        // arrName[i].substring(1) + " ";
        // }
        // System.out.println(newName.trim());

        // System.out.println("Nhập vào ba cạnh của tam giác");
        // System.out.println("Cạnh a");
        // double a = sc.nextDouble();
        // System.out.println("Cạnh b");
        // double b = sc.nextDouble();
        // System.out.println("Cạnh c");
        // double c = sc.nextDouble();
        // revision02 rw = new revision02();
        // rw.isTringagle(a, b, c);

        revision03 rw02 = new revision03();
        System.out.println(rw02.toString());

        LocalDate datearrdate[] = new LocalDate[5];
        LocalDate date = LocalDate.of(2021, 07, 01);

        for (int i = 0; i < datearrdate.length; i++) {
            datearrdate[i] = date;
            date = date.plusDays(1);

        }

        for (LocalDate localdate : datearrdate) {
            System.out.println(localdate);
        }
        System.out.println("Nhập vào số phần tử");
        int sz = sc.nextInt();
        int [] arrA = new int[sz];
        
        for(int i = 0; i < arrA.length; i++) {
            System.out.println("Nhập phần tử thứ : " + i);
            arrA[i] =sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Nhập vào số phần tử");
        int sz1 = sc.nextInt();
        int [] arrB = new int[sz1];
        
        for(int i = 0; i < arrB.length; i++) {
            System.out.println("Nhập phần tử thứ : " + i);
            arrB[i] =sc.nextInt();
        }
        sc.nextLine();
        
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if(arrA[i] == arrB[j]){
                System.out.print(arrA[i] + " " );
                }
            }

        }
    }
}

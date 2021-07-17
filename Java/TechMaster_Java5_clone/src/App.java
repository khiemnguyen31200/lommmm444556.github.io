import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> Student = new ArrayList<Student>();
        //(tên, trạng thái, email,trạng thái, ngày tháng nhập học)
        Student.add( new Student("Khiem","0936439200","khiem31200@gmail.com",true,21,06,2021));
        Student.add( new Student("Phan","0345086683","phanvanmai9898@gmail.com",true,26,05,2021));
        Student.add( new Student("Vu","0964568333","chinhvm54.ymc@gmail.com",true,28,05,2021));
        Student.add( new Student("Hoa","0368025511","hoatrantchh@gmail.com",true,07,06,2021));
        Student.add( new Student("The Vu","0836989111","thevu091193@gmail.com",true,14,06,2021));
        Student.add( new Student("Son","0981776363","tuanson09366455541@gmail.com",true,10,05,2021));
        Student.add( new Student("Manh","0913978247","tcmanh2002@gmail.com",true,21,06,2021));
        Student.add( new Student("Tung","0833401194","tung.daongoc94@gmail.com",true,21,06,2021));
        Student.add( new Student("Trinh Anh","0973012945","cuongtrinhanh300@gmail.com",true,21,06,2021));
        Student.add( new Student("Vu Anh","09666361992","levuanh92@gmail.com",true,21,06,2021));
        Student.add( new Student("Thanh","0354524700","maiduyhungthanh@gmail.com",true,21,06,2021));
    
        for (Student stu : Student) {
            System.out.println(stu);
        }
    }
}

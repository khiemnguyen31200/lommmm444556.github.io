import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Function{
    Scanner scanner = new Scanner(System.in);
    public void defineName(){
        System.out.println("Mời bạn nhập vào: ");
        String Name = scanner.nextLine();
        Name = Name.toLowerCase().trim().replaceAll("\s+", " ");
        String newName = new String();

        String arrName[] = Name.split("\s+");
        for (int i = 0; i < arrName.length; i++) {
        newName += String.valueOf(arrName[i].charAt(0)).toUpperCase() +
        arrName[i].substring(1) + " ";
        }
        System.out.println("Tên sau khi được chuẩn hóa");
        System.out.println(newName.trim());
    }
    public void validate(){
        ArrayList<String> emails= new ArrayList<String>();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
        Matcher matcher = pattern.matcher(email);
        System.out.println(email +" : "+ matcher.matches());
}

      
        
    }
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

        private static final Pattern EMAIL_REGEX =  Pattern.compile(("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$"),Pattern.CASE_INSENSITIVE);
        public static String validateEmail(String email){
            Matcher matcher = EMAIL_REGEX.matcher(email);
            if(matcher.find()){
                    return email;
            }else{
                throw new RuntimeException("Email khong hop le");
            }
            
        }
    
}

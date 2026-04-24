package RegularExpression;

import java.util.regex.Pattern;

public class RegExTester {

    public static void main(String[] args){
        String emailRegex = "^(.+)@[a-zA-Z0-9-]+\\.com$";
        Pattern pattern = Pattern.compile(emailRegex);
        String email = "jeff@gmail.com";
        String email1= "adfa@gmila.co.com";

        System.out.println(pattern.matcher(email).matches());
        System.out.println(pattern.matcher(email1).matches());
    }
}

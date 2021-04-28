package example2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateBaiHat {
    public static void main(String[] args) {
        String nameSong = "https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html";
        checkSing(nameSong);
        String a = new String("đâs");
    }

    public static  void checkSing(String name){
        Pattern pattern = Pattern.compile("^https://www.[\\w/.-]+.html$");
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        System.out.println(check);
    }
}

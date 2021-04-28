package example3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String s1 = "Welcom to Java";
        String s2 = "^(Java1)$";
//        boolean check = s1.matches(s2);
        System.out.println(s1.matches(s2));
//
        // Phương pháp 2
//        Pattern pattern = Pattern.compile(".Java.+");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập chuỗi ");
//        String value = input.nextLine();
//
//        Matcher matcher= pattern.matcher(value);
//
//        boolean check = matcher.matches();
//        System.out.println(check);
//        c
        checkDate("01/01/1990");
        checkPhone("+84-000-000-111");
        checkEmail("hoang92@gamil.com");
        checkEmail("Khanhsởkhanh@gamil.com");

    }
    public static void checkDate(String value){
        Pattern pattern = Pattern.compile("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        Matcher matcher= pattern.matcher(value);
        boolean check = matcher.matches();
        System.out.println(check);
    }

    public static void checkPhone(String value){
        Pattern pattern = Pattern.compile("^\\+84-[0-9]{3}-[0-9]{3}-[0-9]{3}$");
        Matcher matcher= pattern.matcher(value);
        boolean check = matcher.matches();
        System.out.println(check);
    }
    public static void checkEmail(String value){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*@[a-zA-Z0-9]*\\.[a-zA-Z0-9]*$");
        Matcher matcher= pattern.matcher(value);
        boolean check = matcher.matches();
        System.out.println(check);
    }



}

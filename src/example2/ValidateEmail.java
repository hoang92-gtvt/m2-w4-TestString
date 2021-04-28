package example2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        checkOnechar();
        checkNumberchar();
        checkMaxchar();
        checkRandomChar();
        checkRandomChar2();
        checkDate();
        checkNumberOfPhone();
        checkEmail();
    }

    private static void checkOnechar() {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]$");
        Matcher matcher = pattern.matcher("a");
        boolean check = matcher.matches();
        System.out.println(check);
    }
    private static void checkNumberchar() {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{2,3}$");
        Matcher matcher = pattern.matcher("aA12");
        boolean check = matcher.matches();
        System.out.println(check);
    }
    private static void checkMaxchar() {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher matcher = pattern.matcher("aA12dsdwew");
        boolean check = matcher.matches();
        System.out.println(check);
    }
    private static void checkRandomChar() {
        Pattern pattern = Pattern.compile("^\\w+@\\w+");
        Matcher matcher = pattern.matcher("aA12dsdw@ewHJ");
        boolean check = matcher.matches();
        System.out.println(check);
    }
    private static void checkRandomChar2() {
        Pattern pattern = Pattern.compile("^\\w+@+\\w+.\\w+$");
        Matcher matcher = pattern.matcher("aA12ddw@ew.HJ");
        boolean check = matcher.matches();
        System.out.println(check);
    }
    private static void checkDate(){
        Pattern pattern = Pattern.compile("^[0-9]{2}/[0-9]{2}/[0-9]{4}$");
        Matcher matcher = pattern.matcher("17/12/1992");
        boolean check = matcher.matches();
        System.out.println(check);
    }
    private static void checkNumberOfPhone(){
        Pattern pattern = Pattern.compile("^0[8|9][0-9]{2}-[0-9]{3}-[0-9]{3}$");
        Matcher matcher = pattern.matcher("0983-187-333");
        boolean check = matcher.matches();
        System.out.println(check);
    }
    private static void checkEmail(){
        Pattern pattern = Pattern.compile("^[\\w._]*@\\w*.\\w*$");
        Matcher matcher = pattern.matcher("hoang92.gtvt@gmail.com");
        boolean check = matcher.matches();
        System.out.println(check);
    }



}

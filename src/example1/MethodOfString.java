package example1;

public class MethodOfString {
    public static void main(String[] args) {
        String message = "Welcom to Java";
        message.substring(5);
        System.out.println(message.substring(5));
        System.out.println(message.substring(5,11));
        System.out.println(message);
        boolean check = message.startsWith("Wel");
        System.out.println(check);


        String s2 = "Progamming is fun";
        System.out.println(s2.contains("ia"));


    }
}

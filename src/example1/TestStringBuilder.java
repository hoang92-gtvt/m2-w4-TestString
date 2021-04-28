package example1;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder testString = new StringBuilder("begin");
        System.out.println(testString);
        testString.append("abc");
        System.out.println(testString);

        testString.insert(1,'a');
        System.out.println(testString);

        testString.delete(1,2);
        System.out.println(testString);

        testString.setCharAt(0, 'c');
        System.out.println(testString);

        testString.replace(0,2, "abc");
        System.out.println(testString);

        testString.reverse();
        System.out.println(testString);

        int number = testString.capacity();
        System.out.println(number);


    }
}

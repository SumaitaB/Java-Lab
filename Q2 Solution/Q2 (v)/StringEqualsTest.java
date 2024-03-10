public class StringEqualsTest {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = new String("Welcome");
        String s3 = "Welcome";
        System.out.println("s1 == Welcome" + s1.equals("Welcome"));
        System.out.println("s1 == s2 " + s1.equals(s2));
        System.out.println("s1 == s3 " + s1.equals(s3));
        System.out.println("s2 == s3 " + s2.equals(s3));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    } }
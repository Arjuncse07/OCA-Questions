public class Equals5 {
    public static void main(String[] args) {
        String str1 = " ";
        boolean b1 = str1.isEmpty();
        System.out.println(b1);
        str1.trim();
        b1 = str1.isEmpty();
        System.out.println(b1);
    }
}

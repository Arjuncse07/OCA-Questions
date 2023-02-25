public class Equals6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("B"); //Line n1
        sb.append(sb.append("A")); //Line n2
        System.out.println(sb); //Line n3
    }
}

package StringJoiner;
// String Joiner used to join to strings using delimiter.
import java.util.StringJoiner;
public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner tier1= new StringJoiner(",");
        tier1.add("Delhi");
        tier1.add("Mumbai");
        tier1.add("Kolkata");
        tier1.add("Chennai");

        StringJoiner tier2= new StringJoiner(",");
        tier2.add("Jaipur");
        tier2.add("Bhopal");
        tier2.add("Chandigarh");
        tier2.add("Pune");

        tier1.merge(tier2);
        System.out.println(tier1);
    }
}

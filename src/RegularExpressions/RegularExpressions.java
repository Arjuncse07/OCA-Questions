package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {

        int count=0;
        Pattern pattern= Pattern.compile("ab");
        Matcher matcher= pattern.matcher("abababbab");

        while(matcher.find()){
            count++;
            System.out.println(matcher.start());
        }
        System.out.println("Total Number of Occurences:"+count);
    }
}

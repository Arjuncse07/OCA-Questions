package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsFindNumberOfOccurences {

    public static void main(String[] args) {
        int count=0;

        Pattern pattern= Pattern.compile("ab");
        Matcher matcher= pattern.matcher("abababaabbab");

        while (matcher.find()){
            count++;
            System.out.println(matcher.start()+"..."+matcher.end()+"..."+matcher.groupCount()+".."+matcher.group());
        }
        System.out.println("Total Number of Occurences:"+count);
    }
}

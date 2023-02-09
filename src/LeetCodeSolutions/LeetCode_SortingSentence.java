package LeetCodeSolutions;

public class LeetCode_SortingSentence {
    public String sortSentence(String s){

        String[] str= s.split(" ");
        String[] outputArray= new String[str.length];

        for (String tt : str){
            int n= tt.length();
            int position= tt.charAt(n-1)-'0';
            outputArray[position-1]= tt.substring(0, n-1);
        }

        StringBuilder stringBuilder= new StringBuilder();

        for (String tt: outputArray){
            stringBuilder.append(tt);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        LeetCode_SortingSentence codeSortingSentence= new LeetCode_SortingSentence();
        System.out.println(codeSortingSentence.sortSentence("is2 sentence4 This1 a3"));
    }
}

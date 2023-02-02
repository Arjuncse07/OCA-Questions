package LeetCodeSolutions;

public class LeetCode_GoalParser {

    public String interpret(String command) {

      StringBuilder stringBuilder= new StringBuilder();

      for (int i=0; i<command.length(); i++){
          if (command.charAt(i)=='G'){
              stringBuilder.append("G");
          } else if (command.charAt(i)=='(') {
              if (command.charAt(i+1)==')'){
                  stringBuilder.append("o");
              }else {
                  stringBuilder.append("al");
              }
          }
      }
      return stringBuilder.toString();
    }


    public static void main(String[] args) {
     LeetCode_GoalParser leetCode_goalParser= new LeetCode_GoalParser();
        System.out.println(leetCode_goalParser.interpret("(al)G(al)()()G"));
    }
}

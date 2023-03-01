package InterviewQuestions;

public class StringsRotationOfEachOther {
    public static boolean isRotation(String originalString, String rotationString){
      if (originalString == null && rotationString == null){
          return false;
      }else if (originalString.length() != rotationString.length()){
          return false;
      }else {
          String concatinate= originalString+ originalString;
          return concatinate.contains(rotationString);
      }
    }

    public static void main(String[] args) {
        String originalString="abcd";
        String rotationString= "bcda";
        System.out.println(isRotation(originalString,rotationString));

    }
}

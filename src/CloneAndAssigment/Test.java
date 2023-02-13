package CloneAndAssigment;

public class Test {

    public static void main(String[] args) {

        //Assignment Operator == Shallow Copy
        String[] strings1= {"Poccco","Apple","Redmi","Samsung", "Sony","Oppo"};
        String [] strings2= strings1;
        strings2 [2]= null;
        System.out.println(strings1[2]);

        //Clone Method == DeepCopy
        String[] str1= {"Poccco","Apple","Redmi","Samsung", "Sony","Oppo"};
        String[] str2= str1.clone();
        str2[2]= null;
        System.out.println(str1[2]);
    }
}

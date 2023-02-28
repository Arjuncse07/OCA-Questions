package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseThirdElementsOfArray {

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arrayList1){

       ArrayList<Integer> reversedList= new ArrayList<>();
           for (int i=arrayList1.size()-1; i>=0; i-- ){
           reversedList.add(arrayList1.get(i));
       }
        return reversedList;
    }

    public static void printReverseArrayList(ArrayList<Integer> arrayList){
        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(2));
        arrayList.add(new Integer(3));
        arrayList.add(new Integer(4));
        arrayList.add(new Integer(5));
        arrayList.add(new Integer(6));

        System.out.println(reverseArrayList(arrayList));
        printReverseArrayList(arrayList);
    }
}

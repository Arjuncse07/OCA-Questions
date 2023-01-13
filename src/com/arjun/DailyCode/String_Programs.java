package com.arjun.DailyCode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class String_Programs {


    public static void main(String[] args) {

      //System.out.println(reverseWithArray("amit singh"));

       // System.out.println(reverseWithoutArray("hello"));

        //Driver Code
        String str="Arjun is a Good Boy";
        findOccurrenceOfEachChacater(str);

    }

    private static String reverseWithArray(String str){

        char ch[] = new char[str.length()];

        int flag=0;
        for(int i=str.length()-1; i>=0; i-- ){

           ch[flag]= str.charAt(i);

           flag++;
        }

        return String.valueOf(ch);

    }

    private  static String reverseWithoutArray(String str){

        String reverseStr="";

        for(int i=str.length()-1; i>=0; i-- ){
           // reverseStr=reverseStr+str.charAt(i);
            reverseStr+=str.charAt(i);
        }

        return reverseStr;

    }

    private  static void findOccurrenceOfEachChacater(String  inputString) {
     HashMap<Character,Integer> charCountMap= new HashMap<>();
        // Converting given string to char array
     char[] strArray= inputString.toCharArray();
     //checking each char of the strArray
     for(char c: strArray){
         if(charCountMap.containsKey(c)){
             //if char is present in charCountMap increment it's count by 1.
             charCountMap.put(c, charCountMap.get(c)+1);
         }else {
             charCountMap.put(c,1);
         }
     }
         //printing the charCountMap
        for (Map.Entry entry:charCountMap.entrySet()) {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }


    //private static void find
}

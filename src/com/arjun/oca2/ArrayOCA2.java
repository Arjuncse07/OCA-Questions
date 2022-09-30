package com.arjun.oca2;

public class ArrayOCA2 {
    public static void main(String[] args) {
        int[] x= new int[3];
        System.out.print(x.length);  //length variable applicable for the arrays
       // System.out.println(x.length()); //length method is not applicable for arrays

        String a="Arjun";
        System.out.println(a.length()); //length method is only applicable for object like string

        int[][] array= new int[6][3];
        System.out.println(array.length);  //6
        System.out.println(array[0].length+" "+array[1].length+" "+array[2].length+" "+array[3].length);

        String[] s= {"A","AA","AAA","AAAA"};
        System.out.println("Length of s:"+s.length);
        //System.out.println(s.length()); //CE
        System.out.println(s[0].length()+" "+s[1].length()+" "+s[2].length()+" ");

    }
}

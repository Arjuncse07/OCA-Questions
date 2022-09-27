package com.arjun.DataTypes;
//Literals: Any constant value can be assigned to variable is called literal.
/***
 * 8 Primitive Data Types are in Java
 * Numeric Data Types are 6
 * integral data types: byte,short, int, long
 * floating point data-types: float and double
 * decimal form(base-10)
 *  0-9
 *  int x=123;
 * int x=999;
 *
 * octal form(base-8)
 * 0 to 7
 * int x=010;
 * int x=0786;  INVALID Because 8 is not allowed
 *
 * Hexa-decimal form(base-16)
 * 0-9, a-f(A to F)
 * 0x or Ox
 * int x=0XFace;
 * int x=0XBeef;
 * int x=0XBeer; invalid
 *
 * byte form
 * 0-127 above it not possible
 *
 * From 1.7: binary form (base-2)
 *  digits: 0,1
 *  0B or 0b
 *  int x=0B11111;
 * Range of int
 * 4 bytes -128to 127
 *
 * Which are valid declarations?
 *
 */
public class DataTypesEx4 {
    public static void main(String[] args) {
     int x=0777;
    // int x1=0786;   //In octal digit 8 is not allowed
     //int x2=OXFace;
     int x6=0xFace;
     int x3=0xbeef;
     int xx=0b1111;
    // int x4=0xbeer; //in hexadecimal r is not allowed
     int x5=0xadda;
        System.out.println("xx:"+xx);

     int x7=10;
     int x8=010;
     int x11=0x10;
     int x12=0X10;
     int x10=0B10;
     int x14=999;
     //int x9=OX10;
     //int x15= 10.5; NOT VALID double can't be assign to int
        System.out.println(x7+" "+x8+" "+ x10+ " "+x11+" "+x12+" "+x14);

        /**
         * Following declartions are valid
         * a. int a=10;
         * b.long b=10L;
         * c.long c=10;
         * d.int d= 10L;  //ce:Compile Time error: can't assign long(8byte) to int(4 byte)
         */

        byte b=127;
       // byte b1=128; NOT VALID above the limit
       //byte b1=130; NOT VALID
//        byte b2=true; NOT VALID
//        byte b3="asko";  NOT VALID
        short s=32767;
        //short s1=32768; NOT VALID above the limit

        //float f=123.456; possible lossy conversion from double to float
        float f1= 123.456f;
        double d2=123.456;
        double d3=123.456D;
        double d4=123.456d;

        double d=0123.456;
       // double d5=0X123.456; NOT VALID because
        double d6=0XFace;  //Valid , it is integral literal
        double d7=0777;
        double d8=0xbeef;
        //double d9=OXArjun; // O are not allowed
        //double d13=0xArjun; only a-f are allowed
        double d10=0Xface;
       // double d11=0768; NOT VALID
        double d12=0786.0;
        double d13= 1.2e3; //Valid 1.2*3 means1.2* 10^3= 1200.0
        double d14= 1.2e3d;
        System.out.println(d13);
        System.out.println(d14);
        /**
         * Use of _ in numeric literals
         *To improve the readiblity of the source code _ symbol is used
         * can't use in beginning _12 and 1234_ (end) not valid
         */

        double d15= 123_34.345;
        int amit= 123_12;
        double d16=1__23_4_56.34;
       // double 1234.34_; Not Valid
       // double d16=_123.345; Not valid
       // double d17=123_.45; Not Valid
        System.out.println(amit);

        /**
         * For every character unicode value
         * char allowed values are
         *  0 to 65535
         * a---->97
         * b---->98
         * A--->65
         * B-->66
         */
        char ch='a';
        char ch1=65535;
        //char ch2='amit'; Invalid
        //char ch1="a"; Invalid
        //char ch1='as'; Invalid
       char cc=197;
       char ee=1970;
       char ch12='\u0061';
       char ch13='\ubeef';
       char ch14='\uabcd';
       //char ch15='\iface'; invalid
      // char ch16= \u0061; invalid
        System.out.println("ch12:"+ch12);
        }
}

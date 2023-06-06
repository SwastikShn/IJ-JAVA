package com.swastik;
import java.util.Scanner;
public class TypeCasting
{

    public static void main(String[] args)
    {
//        TypeConversion Int to Float BY DEFAULT
//
//        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();
//        System.out.println(num);


//        Type Casting
//        int num = (int)(56.87f);
//        System.out.println(num);


//        Automatic Type Promotion in Expressions
//        Max. Value of Byte is 256. If we put a greater value it will store the remainder.
//        int a = 258;
//        byte b = (byte)(a);
//        System.out.println(b);
//        It will print 2 i.e. remainder 258%256


//      Automatic Type Promotion of Byte to Int
//        byte a = 40;
//        byte b = 50;
//        byte c =100;
//        int d = (a*b)+c;           //Result--> 2100
//        int e = (byte)((a*b)+c);   //Result--> 52
//        int f = (byte)((a*b)) + c; //Result--> 52
//
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);

//        byte g = b*2; //Shows an error as--> When apply any operation on BYTE, it is done implicitly converting it into INT and now the answer generated is in INT form and we can't store INT in BYTE i.e. g
//        System.out.println(g);

//        Automatic Type Conversion form Char to Int by using ASCII Values
//        int something = 'a';
//        System.out.println(something); //Result--> 97 i.e. the ASCII Value of 'a'

//        JAVA Follows UNICODE PRINCIPLE --> Can put any language into it. For eg. Hindi
//        System.out.println("दरबार");

//        If any term's data type in the operations is higher than the other, then the lower one is promoted to the higher and the value is returned in the higher data type
//        System.out.println(3 * 4.432423f); //Promoted to Float; Result--> 13.29727
//        int a = 5;
//        char c = 'a';
//        float f = 24.1f;
//        short s = 987;
//        byte b = 23;
//        double d = 0.1234;
//        double result = a+c+f+s+b+d;
//        System.out.println(result); //Result--> 1136.2233755859374 as all are promoted to double for application of operations

    }

}

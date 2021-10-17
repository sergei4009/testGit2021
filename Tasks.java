package day01;

import java.util.Scanner;

public class Tasks
{
    public static void main(String[] args)
    {
       int i = 1;
       while (i < 10)
       {
           System.out.println("Java");
           i++;
       }
       for (i=0;i<10;i++)
       {
           System.out.println("Java");
       }

       int year = 1980;
       while (year< 2021)
       {
           System.out.println("Олимпиада " + year + " года");
           year+=4;
       }
       for (int a = year ;year < 2021;year+=4)
       {
           System.out.println("Олимпиада "+year + " года");
       }

       int k = 3;
       for(int i = 1; i<10; i++)
       {
           int res = i*k;
           System.out.println(i +" x " + k + " = " + res);
       }


    }
}

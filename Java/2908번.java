//https://velog.io/@cjhlsb

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       StringBuffer sb1 = new StringBuffer(Integer.toString(num1));
       StringBuffer sb2 = new StringBuffer(Integer.toString(num2));
       sb1.reverse();
       sb2.reverse();
       if(Integer.parseInt(sb1.toString())>Integer.parseInt(sb2.toString()))
    	   System.out.println(sb1);
       else
    	   System.out.println(sb2);
    }
}
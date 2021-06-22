import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       char[] a = input.toCharArray();
       for(int i=0;i<a.length;i++)
       {
    	  if(a[i]=='C' || a[i]=='A' || a[i]=='M' || a[i]=='B' || a[i]=='R' || a[i]=='I' || a[i]=='D' || a[i]=='G' || a[i]=='E')
    		  a[i] = ' ';
       }
       input = new String(a).replaceAll(" ", "");
       System.out.println(input);
    }
}
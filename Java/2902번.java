//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       String[] arr = input.split("-");
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i].charAt(0));
       }
    }
}
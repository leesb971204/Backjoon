//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       String[] arr = input.split("/");
       if((Integer.parseInt(arr[0])+Integer.parseInt(arr[2])) < Integer.parseInt(arr[1]) || 
    		   Integer.parseInt(arr[1]) == 0)
    	   System.out.println("hasu");
       else
    	   System.out.println("gosu");
    }
}
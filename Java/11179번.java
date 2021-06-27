//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       String binary = Integer.toBinaryString(num);
       
       StringBuilder sb = new StringBuilder(binary);
       sb.reverse();
       
       int output = Integer.parseInt(sb.toString(),2);
       System.out.println(output);
       
    }
}
//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String input = sc.next();
       StringBuilder st = new StringBuilder(input);
       System.out.println(input.equals(new String(st.reverse()))?1:0);
    }
}
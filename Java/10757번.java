//https://velog.io/@cjhlsb
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	BigInteger num1 = new BigInteger(sc.next());
    	BigInteger num2 = new BigInteger(sc.next());
    	System.out.println(num1.add(num2));
    }
}
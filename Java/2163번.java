//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	if((n*m) == 1)
    		System.out.println(1);
    	else
    		System.out.println((n*m)-1);
    }
}
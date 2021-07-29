//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int L = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int D = sc.nextInt();
    	
    	if(A % C > 0)
    		C = A /C + 1;
    	else
    		C = A /C;
    	
    	if(B % D > 0)
    		D = B /D + 1;
    	else
    		D = B /D;
    	
    	System.out.println(C>=D?L-C:L-D);
    }
}
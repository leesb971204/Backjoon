//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	String input = sc.next();
    	if(input.charAt(1)=='x')
    		System.out.println(Integer.parseInt(input.replaceFirst("^0x", ""),16));
    	else if(input.charAt(0)=='0')
    		System.out.println(Integer.parseInt(input,8));
    	else
    		System.out.println(input);
    }
}
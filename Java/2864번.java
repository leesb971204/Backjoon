//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	int num1 = sc.nextInt();
  	int num2 = sc.nextInt();
  	
  	String a = Integer.toString(num1);
  	String b = Integer.toString(num2);
  	String c = Integer.toString(num1);
  	String d = Integer.toString(num2);
  	a = a.replace('5', '6');
  	b = b.replace('5', '6');
  	c = c.replace('6', '5');
  	d = d.replace('6', '5');
  	System.out.print(Math.min((Integer.parseInt(a) + Integer.parseInt(b)),(Integer.parseInt(c) + Integer.parseInt(d)))+" ");
  	System.out.print(Math.max((Integer.parseInt(a) + Integer.parseInt(b)),(Integer.parseInt(c) + Integer.parseInt(d))));
  }
}
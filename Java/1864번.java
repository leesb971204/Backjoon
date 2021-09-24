//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
  	HashMap<Character,Integer> map = new HashMap<>();
  	map.put('-', 0);
  	map.put('\\', 1);
  	map.put('(', 2);
  	map.put('@', 3);
  	map.put('?', 4);
  	map.put('>', 5);
  	map.put('&', 6);
  	map.put('%', 7);
  	map.put('/', -1);
  	
  	while(true)
  	{
  		String input = sc.next();
  		int sum = 0;
  		if(input.equals("#"))
  			break;
  		for(int i=0;i<input.length();i++)
  		{
  			sum += (map.get(input.charAt(i)) * Math.pow(8, input.length()-i-1));
  		}
  		System.out.println(sum);
  	}
  }
}
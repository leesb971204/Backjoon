import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String k = sc.next();
		String word = "";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
				word += s.charAt(i);
		}
		System.out.println(word.contains(k) ? "1" : "0");
		
	}
}

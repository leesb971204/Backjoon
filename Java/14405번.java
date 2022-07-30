import java.util.*;
public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String word = sc.next();
	 word = word.replaceAll("pi|ka|chu", "");
	 
	 
	 System.out.println(word.length() > 0 ? "NO" : "YES");
 }
}

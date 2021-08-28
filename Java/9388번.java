//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
  public static void main(String[] args){
  	Scanner sc= new Scanner(System.in);
  	int num = sc.nextInt();
  	for(int i=0;i<num;i++)
  	{
  		String word1 = sc.next();
  		String word2 = sc.next();
  		if(word1.equals(word2)) //로그인 성공
  			System.out.println("Case "+(i+1)+": Login successful.");
  		else {
  			if(deleteNum(word1).equals(word2))
  				System.out.println("Case "+(i+1)+": Wrong password. Please, check your num lock key.");
  			else if((changealp(word1)).equals(word2))
  				System.out.println("Case "+(i+1)+": Wrong password. Please, check your caps lock key.");
  			else if(deleteNum(word1).equals(changealp(word2))) 
  				System.out.println("Case "+(i+1)+": Wrong password. Please, check your caps lock and num lock keys.");
  			else
  				System.out.println("Case "+(i+1)+": Wrong password.");
  				
  		}	
  	}
  	
  }
  public static String deleteNum(String word1)
  {
	String word = "";
	for(int i=0;i<word1.length();i++)
	{
		if(Character.isDigit(word1.charAt(i)) == false)
			word += word1.charAt(i);
	}
	return word;
  }
  
  public static String changealp(String word1)
  {
	  String word = "";
	  for(int i=0;i<word1.length();i++)
	  {
		  if(Character.isUpperCase(word1.charAt(i)) == true)
				word += (char)(word1.charAt(i)+32);
			else if(Character.isLowerCase(word1.charAt(i)) == true)
				word += (char)(word1.charAt(i)-32);
			else
				word += (char)(word1.charAt(i));
	  }
	  return word;
  }
}	

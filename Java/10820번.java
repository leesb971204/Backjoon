//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	while(sc.hasNextLine())
    	{
    		String input = sc.nextLine();
    		int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
    		for(int i=0;i<input.length();i++)
    		{
    			if(input.charAt(i) >= 97 && input.charAt(i) <= 122)
    				cnt1++;
    			else if(input.charAt(i) >= 65 && input.charAt(i) <= 90)
    				cnt2++;
    			else if(input.charAt(i) >= 48 && input.charAt(i) <= 57)
    				cnt3++;
    			else if(input.charAt(i) == 32)
    				cnt4++;
    		}
    		System.out.println(cnt1+" "+cnt2+" "+cnt3+" "+cnt4);
    	}
    }
}

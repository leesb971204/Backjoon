//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	char[][] arr = new char[15][15];
    	for(int i=0;i<5;i++)
    	{
    		String input = sc.nextLine();
    		for(int j=0;j<input.length();j++)
    		{
    			arr[i][j] = input.charAt(j);
    		}
    	}
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=0;j<arr.length;j++)
    		{
    			if(arr[j][i] != 0)
    				System.out.print(arr[j][i]);
    		}
    	}
    }
}
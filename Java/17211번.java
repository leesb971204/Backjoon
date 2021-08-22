//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
    	int n = sc.nextInt();
    	double m = sc.nextInt();
    	double[] arr = new double[4];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i] = sc.nextDouble();
    	}
    	m = (1-m)*1000;
    	for(int i=0;i<n;i++)
    	{
    		m = m*arr[0] + (1000-m)*arr[2];
    	}
    	System.out.println(String.format("%.0f",m));
    	System.out.println(String.format("%.0f",1000-m));
    }
}

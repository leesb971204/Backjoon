import java.util.*;
public class Main{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   int[] arr = new int[num];
	   int[] tmp = new int[num];
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   for(int i=0;i<arr.length-1;i++)
	   {
		   int cnt = 0;
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i] > arr[j])
				   cnt++;
			   else
				   break;
		   }
		   tmp[i] = cnt;
	   }
	   Arrays.sort(tmp);
	   System.out.println(tmp[tmp.length-1]);
   }
}
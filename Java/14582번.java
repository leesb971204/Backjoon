import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] zem = new int[9];
		int[] star = new int[9];
		boolean flag = false;
		int sum1 = 0, sum2 = 0;
		for(int i=0;i<zem.length;i++)
		{
			zem[i] = sc.nextInt();
		}
		for(int i=0;i<star.length;i++)
		{
			star[i] = sc.nextInt();
		}
		for(int i=0;i<zem.length;i++)
		{
			sum1 += zem[i];
            if(sum1 > sum2)
				flag = true;
			sum2 += star[i];
		}
		System.out.println(flag ? "Yes":"No");
		
	}
}

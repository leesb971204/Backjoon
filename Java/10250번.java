//https://velog.io/@cjhlsb
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	for(int i=0;i<num;i++)
    	{
    		int H = sc.nextInt();
    		int W = sc.nextInt();
    		int N = sc.nextInt();
    		int cnt = 1; //호수
    		
    		if(H != N) {
    		while(H <= N)
    		{
    			N -= H;
    			if(N == 0) //꼭대기층에 도달하는 순간
    				break;
    			else
    				cnt++;
    		}
    		if(N == 0) //N%H가 나누어 떨어질 때
    			System.out.println(cnt<10?H+"0"+cnt:H+""+cnt);
    		else //그 이외의 경우
    			System.out.println(cnt<10?(N%H)+"0"+cnt:(N%H)+""+cnt);
    		}
    		
    		else //N=H이라 첫 라인의 꼭대기층에 배치해줄 때
    			System.out.println(N+"01");
    	}
    }
}
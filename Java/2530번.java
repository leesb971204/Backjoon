//https://velog.io/@cjhlsb
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int hour = sc.nextInt();
    	int minutes = sc.nextInt();
    	int second = sc.nextInt();
    	int input = sc.nextInt();
    	
    	second += input;
    	
    	if(second >= 60) {
    		minutes += second/60;
    		second %= 60;
    	}
    	if(minutes >= 60) {
    		hour += minutes/60;
    		minutes %= 60;
    	}
    	if(hour >= 24) {
    		hour %= 24;
    	}
    	System.out.println(hour+" "+minutes+" "+second);
    	
    }
}
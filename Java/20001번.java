//https://velog.io/@cjhlsb
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Stack<Integer> st = new Stack<>();
       while(true)
       {
    	   String input = sc.nextLine();
    	   if(input.equals("고무오리 디버깅 끝"))
    		   break;
    	   
    	   if(st.size()==0) {
    		   if(input.equals("고무오리")) {
    			   st.add(1);
    			   st.add(1);
    		   }
    		   else if(input.equals("문제"))
    			   st.add(1);
    	   }
    	   else if(st.size()!=0){
    		   if(input.equals("고무오리"))
    			   st.pop();
    		   else if(input.equals("문제"))
    			   st.add(1);
    	   }
    		   
       }
       System.out.println(st.size()>0?"힝구":"고무오리야 사랑해");
    }
}
import java.util.*;
public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 Queue<Integer> que = new LinkedList<>();
	 Queue<Integer> tmp = new LinkedList<>();
	 boolean flag = true;
	 for(int i=0;i<n;i++)
	 {
		 que.add(i+1);
	 }
	 while(que.size() > 1) {
		 if(flag) {
			 tmp.add(que.poll());
			 flag = !flag;
		 }
		 else {
			 que.add(que.poll());
			 flag = !flag;
		 }
	 }
	 for(Integer i : tmp)
	 {
		 System.out.print(i+" ");
	 }
	 System.out.print(que.poll());
 }
}

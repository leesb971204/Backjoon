import java.util.*;
class Solution {
    public int solution(String dirs) {
    int nowX = 0;
	 int nowY = 0;
	 int[] dx = {0,0,1,-1};
	 int[] dy = {1,-1,0,0};
	 char[] dir = {'U','D','R','L'};
	 HashSet<String> map = new HashSet<>();
	 for(int i=0;i<dirs.length();i++)
	 {
		 int nextX = nowX;
		 int nextY = nowY;
		 String s = "";
		 for(int j=0;j<dir.length;j++)
		 {
			 if(dirs.charAt(i) == dir[j]) {
				 nextX += dx[j];
				 nextY += dy[j];
				 if(nextX > 5 || nextY > 5 || nextX < -5 || nextY < -5)
					 break;
				 else {
				 if(dir[j] == 'U' || dir[j] == 'R') {
						 s += nowX;
						 s += nowY;
						 s += nextX;
						 s += nextY;
					 }
					 else {
						 s += nextX;
						 s += nextY;
						 s += nowX;
						 s += nowY;
					 }
				 map.add(s);
				 nowX = nextX;
				 nowY = nextY;
				 
				 }
			 }
				 
		 }
	 }
        return map.size();
    }
}
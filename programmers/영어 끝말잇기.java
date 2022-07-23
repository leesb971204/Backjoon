import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int turn = 1;
        boolean flag = true;
	 HashMap<String, Boolean> map = new HashMap<>();
	 map.put(words[0], false);
	for(int i=1;i<words.length;i++)
	 {
		 if(i % n == 0)
			 turn++;
		 if(checkFirst(words[i-1],words[i]) == false) {
			 answer[0] = i%n+1;
             answer[1] = turn;
             flag = false;
             break;
		 }
			 
		 else {
			 if(map.containsKey(words[i])) {
				 answer[0] = i%n+1;
                answer[1] = turn;
                 flag = false;
                 break;
			 }
			 else
				 map.put(words[i], false);
		 }
		  
	 }
       if(flag){
           answer[0] = 0;
           answer[1] = 0;
       } 
        return answer;
    }
    boolean checkFirst(String word1, String word2)
    {
        if(word1.charAt(word1.length()-1) != word2.charAt(0))
            return false;
        else
            return true;
    }
}
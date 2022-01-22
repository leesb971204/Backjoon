import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
      	Map<String, HashSet<String>> list = new HashMap<>();
	        Map<String, Integer> cnt = new HashMap<>();
	        for(String i : id_list)
	        {
	            cnt.put(i,0);
	            list.put(i,new HashSet<String>());
	        }
	        
	        for(String i : report)
	        {
	            String[] spl = i.split(" ");
	            list.get(spl[1]).add(spl[0]);
	        }
	        
	        for(String i : list.keySet()){
	            HashSet<String> reporter = list.get(i);
	            if(reporter.size() >= k){
	                for(String q : reporter){
	                    Integer mail = cnt.get(q);
	                    cnt.put(q,mail+1);
	                }
	            }
	        }
	        
	        for(int i=0;i<answer.length;i++)
	        {
	            answer[i] = cnt.get(id_list[i]);
            }
        return answer;
    }
}
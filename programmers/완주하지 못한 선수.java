import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
       HashMap<String, Integer> map = new HashMap<>();
		for(String i : participant)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(String i : completion)
		{
			map.put(i, map.get(i)-1);
		}
		
		for (String key : map.keySet()) {
            if (map.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    
    }
}
import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        ArrayList<Integer> num = new ArrayList<>();
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,Integer> cnt = new HashMap<>();
        for(int i=0;i<clothes.length;i++)
        {
            map.put(clothes[i][0],clothes[i][1]);
        }
        for(String key : map.keySet())
        {
            cnt.put(map.get(key),cnt.getOrDefault(map.get(key), 0) + 1);
        }
        for(String key : cnt.keySet())
        {
            answer *= cnt.get(key)+1;
        }
        return answer-1;
    }
}
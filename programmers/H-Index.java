import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());
        for(int i=0;i<tmp.length;i++)
        {
            if (i < tmp[i])
             answer +=1;
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++)
        {
            list.add(numbers[i]);
        }
        while(list.size() != 10){
            list.add(11);
        }
        
        for(int i=0;i<10;i++)
        {
            if(list.get(i) != i){
                answer += i;
                list.add(i,i);
            }
                
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        for(int i=0;i<answers.length;i++)
        {
            if(answers[i] == first[i%first.length])
                cnt[0]++;
            if(answers[i] == second[i%second.length])
                cnt[1]++;
            if(answers[i] == third[i%third.length])
                cnt[2]++;
        }
        int maxScore = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == cnt[0]) {list.add(1);}
        if(maxScore == cnt[1]) {list.add(2);}
        if(maxScore == cnt[2]) {list.add(3);}
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 1;
        if((100 - progresses[0]) % speeds[0] == 0)
            st.push((100 - progresses[0]) / speeds[0]);
        else
            st.push(((100 - progresses[0]) / speeds[0]) + 1);
        for(int i=1;i<progresses.length;i++)
        {
            int day = 0;
            if((100 - progresses[i]) % speeds[i] == 0)
                day = ((100 - progresses[i]) / speeds[i]);
            else
                day = (((100 - progresses[i]) / speeds[i]) + 1);
            
            if(st.peek() >= day){
                cnt++;   
            }
            else{
                list.add(cnt);
                cnt = 1;
                st.push(day);   
            }
        }
        list.add(cnt);
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
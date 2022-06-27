import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        Stack<Character> tmp = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            st.push(s.charAt(i));
        }
        
        while(!st.isEmpty()){
            if(tmp.size() == 0)
                tmp.push(st.pop());
            if(!st.isEmpty()){
                if(tmp.peek() == st.peek()){ //연속한 문자 2개가 같으면
                    tmp.pop();
                    st.pop();
                }
                else{ //연속한 문자가 다를 경우
                    tmp.push(st.pop());
                }
            }
        }
        
        
        return tmp.size() == 0 ? 1 : 0;
    }
}
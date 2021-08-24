//https://velog.io/@cjhlsb
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt = 0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i) == '(')
                    cnt+=1;
                else if(s.charAt(i) == ')')
                    cnt-=1;
                if(cnt < 0)
                    return false;
            }
            
        
        if(cnt == 0 && s.charAt(0) == '(' && s.charAt(s.length()-1) == ')')
            return true;
        
        else
            return false;

    }
}
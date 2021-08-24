//https://velog.io/@cjhlsb
import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
                sb.append(" ");
            else if(s.charAt(i-1) == ' ')
                sb.append(Character.toUpperCase(s.charAt(i)));
            else
                sb.append(s.charAt(i));
        }
        answer = sb.toString();
        return answer;
    }
}
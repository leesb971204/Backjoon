import java.util.*;
class Solution {
    public String solution(String s) {
        ArrayList<Character> list = new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{
		list.add(s.charAt(i));
	}
	Collections.sort(list,Comparator.reverseOrder());
	String answer = "";
	for(char i : list)
	{
		answer += i;
	}
        return answer;
    }
}
public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0;i<Integer.toString(n).length();i++)
		{
			answer += Integer.parseInt(String.valueOf(Integer.toString(n).charAt(i)));
		}
        return answer;
    }
}
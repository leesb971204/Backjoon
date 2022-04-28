class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder(s);
	    for(int i=0;i<s.length();i++)
	    {
	    	if(sb.charAt(i) != ' ') {
	    		if((s.charAt(i) >= 65 && s.charAt(i) <= 90 && s.charAt(i) + n > 90) ||
					s.charAt(i) >= 97 && s.charAt(i) <= 122 && s.charAt(i) +n > 122) {
				sb.setCharAt(i, (char) (sb.charAt(i) + n - 26));
			}
	    		else
	    			sb.setCharAt(i, (char) (sb.charAt(i) + n));
	    	}
    	}
        answer = sb.toString();
        return answer;
    }
}
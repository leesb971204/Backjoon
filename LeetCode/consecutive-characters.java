class Solution {
    public int maxPower(String s) {
        s += " ";
        char word = s.charAt(0);
        int cnt = 1;
        int tmp = 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i) == word)
                tmp++;
            else{
                word = s.charAt(i);
                cnt = Math.max(cnt,tmp);
                tmp = 1;
            }
        }
        return cnt;
    }
}
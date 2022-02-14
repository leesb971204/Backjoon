class Solution {
    public int balancedStringSplit(String s) {
        int r = 0, l = 0, cnt = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'R')
                r++;
            else
                l++;
            if(l == r)
                cnt++;
            
        }
        return cnt;
    }
}
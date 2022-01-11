class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray())
        {
            if(i < spaces.length && sb.length() == spaces[i] + i)
            {
                sb.append(' ');
                i++;
            }
            sb.append(c);
        }
        
        return sb.toString();
    }
}
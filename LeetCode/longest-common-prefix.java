//https://velog.io/@cjhlsb
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = strs[0];
        if(output.length()>0){
            for(int i=1;i<strs.length;i++)
            {
                while(strs[i].indexOf(output) != 0)
                    output = output.substring(0,output.length()-1);
                if(output.length() <= 0)
                    output = "";
            }
        }
        else
            output = "";
    
        return output;
    }
    
}
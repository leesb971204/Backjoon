import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
           if(s.length() != t.length())
          return false;
    
        Map<Character,Integer> map1=new HashMap<>();        
        Map<Character,Integer> map2=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            
            Integer r1=map1.put(c1,i);
            Integer r2=map2.put(c2,i);
            
            if(r1==null && r2==null)
                continue;
            else if(r1==null || r2==null)
                return false;                        
            else if(!r1.equals(r2))
                return false;
            
        }
        
        return true;
    }  
    }

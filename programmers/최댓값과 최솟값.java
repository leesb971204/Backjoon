import java.util.*;
class Solution {
    public String solution(String s) {
        String[] tmp = s.split(" ");
        int[] arr = new int[tmp.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(arr);
        return arr[0]+" "+arr[arr.length-1];
    }
}
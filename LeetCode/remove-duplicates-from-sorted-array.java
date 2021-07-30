//https://velog.io/@cjhlsb
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        int i = 0;
        TreeSet<Integer> tr = new TreeSet<Integer>();
        tr.addAll(hs);
        for(int n : tr)
        {
            nums[i++] = n;
        }
        return hs.size();
    }
}
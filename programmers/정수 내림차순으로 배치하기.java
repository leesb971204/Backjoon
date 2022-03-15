import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
		Integer[] arr = new Integer[Long.toString(n).length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(String.valueOf(Long.toString(n).charAt(i)));
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(Integer i : arr)
		{
			answer += Long.parseLong(Integer.toString(i));
		}
        return Long.parseLong(answer);
    }
}
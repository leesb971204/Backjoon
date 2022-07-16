import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        Integer[] tmp = new Integer[numbers.length];
        for(int i=0;i<tmp.length;i++)
        {
            tmp[i] = numbers[i];
        }
        Arrays.sort(tmp,new Comparator<Integer>() {
		 @Override
			public int compare(Integer o1, Integer o2) {
				int compareA = Integer.parseInt(Integer.toString(o1) + Integer.toString(o2));
				int compareB = Integer.parseInt(Integer.toString(o2) + Integer.toString(o1));
				return compareB - compareA;
			};
	 });
        for(Integer i : tmp)
	 {
		answer += i;
	 }
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
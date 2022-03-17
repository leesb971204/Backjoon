import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] result = new Double[N];
		Double[] tmp = new Double[N];
		for(int i=0;i<result.length;i++)
		{
			int cnt1 = 0;
			int cnt2 = 0;
			for(int j=0;j<stages.length;j++)
			{
				if(stages[j] == i+1)
					cnt1++;
				else if(stages[j] < i+1)
					cnt2++;
					
			}
			result[i] = cnt1 > 0 ? (double)cnt1/(double)(stages.length-cnt2) : 0;
			tmp[i] = result[i];
		}
		Arrays.sort(result,Collections.reverseOrder());
		
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<tmp.length;j++)
			{
				if(result[i] == tmp[j])
					answer[i] = j+1;
			}
		}
        return answer;
    }
}
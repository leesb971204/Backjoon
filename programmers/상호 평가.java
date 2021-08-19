import java.util.*;
class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        for(int i=0;i<scores.length;i++)
        {
            int tmp = 0;
            int sum = 0;
            int avg = 0;
            int[] arr = new int[scores.length];
            for(int j=0;j<scores[i].length;j++)
            {
                arr[j] = scores[j][i];
                if(i == j)
                {
                    tmp = scores[j][i];
                }
                sum += scores[j][i];
            }
            Arrays.sort(arr);
            if(tmp < arr[1] || tmp > arr[arr.length-2])
            {
                sum -= tmp;
                avg = sum / (scores[i].length-1);
            }
            else
                avg = sum / scores[i].length;
            
            if(avg>=90)
    			answer += "A";
    		else if(avg >= 80 && avg < 90)
    			answer += "B";
    		else if(avg >= 70 && avg < 80)
    			answer += "C";
    		else if(avg >= 50 && avg < 70)
    			answer += "D";
    		else
    			answer += "F";
            
        }
        return answer;
    }
}
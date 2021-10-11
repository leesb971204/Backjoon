import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0;i<sizes.length;i++)
        {
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        int[] arr1 = new int[sizes.length];
        int[] arr2 = new int[sizes.length];
        for(int i=0;i<sizes.length;i++)
        {
            arr1[i] = sizes[i][0];
            arr2[i] = sizes[i][1];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        answer = arr1[arr1.length-1] * arr2[arr2.length-1];
        return answer;
    }
}
//https://velog.io/@cjhlsb
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] answer = new int[2];
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<aliceSizes.length;i++)
        {
            sum1 += aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++)
        {
            sum2 += bobSizes[i];
        }
        
        int gap = (sum1 - sum2) / 2;
        
        for(int i=0;i<aliceSizes.length;i++)
        {
            for(int j=0;j<bobSizes.length;j++)
            {
                if(aliceSizes[i] == bobSizes[j]+gap)
                {
                    answer[0] = aliceSizes[i];
                    answer[1] = bobSizes[j];
                }
            }
        }
        return answer;
    }
}
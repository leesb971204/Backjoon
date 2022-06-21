class Solution {
    public int solution(int n) {
        int answer = 0;
        String binaryN = Integer.toBinaryString(n);
        int cntN = 0;
        for(int i=0;i<binaryN.length();i++)
        {
            if(binaryN.charAt(i) == '1')
                cntN++;
        }
        answer = cntN;
        for(int i=n+1;i<=1000000;i++)
        {
            if(cntOne(i) == cntN){
                answer = i;
                break;
            }        
        }
        return answer;
    }
    int cntOne(int num)
    {
        String numToBinary = Integer.toBinaryString(num);
        int cnt = 0;
        for(int i=0;i<numToBinary.length();i++)
        {
            if(numToBinary.charAt(i) == '1')
                cnt++;
        }
        return cnt;
    }
    
}
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int runTime = 0;
        int deleteCnt = 0;
        while(true)
        {
            String binaryString = "";
            deleteCnt += s.length();
            s = s.replaceAll("0","");    
            binaryString = Integer.toBinaryString(s.length());
            deleteCnt -= s.length();
            if(binaryString.equals("1"))
                break;
            else{
                runTime++;
                s = binaryString;
            }
        }
        runTime++;
        answer[0] = runTime;
        answer[1] = deleteCnt;
        
        return answer;
    }
}
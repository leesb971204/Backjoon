class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num != 1)
        {
            if(answer == 500)
                break;
            if(num % 2 == 0)
                num /= 2;
            else if(num %2 == 1){
                num *= 3;
                num++;
            }
            answer++;
        }
        return answer==500?-1:answer;
    }
}
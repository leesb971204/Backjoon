class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++)
        {
            if(sumNumber(i,n) == true)
                answer++;
        }
        return answer;
    }
    boolean sumNumber(int num,int goal)
    {
        boolean flag = false;
        int sum = 0;
        for(int i=num;i<=goal;i++)
        {
            sum += i;
            if(sum == goal){
                flag = true;
                break;
            }
            else if(sum > goal){
                break;
            }
        }
        return flag;
    }
}
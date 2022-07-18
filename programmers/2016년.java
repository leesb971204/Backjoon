class Solution {
    public String solution(int a, int b) {
        int cnt = 0;
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=1;i<a;i++)
        {
            cnt += month[i];
        }
        cnt += b;
        return day[(cnt + 4) % 7];
    }
}
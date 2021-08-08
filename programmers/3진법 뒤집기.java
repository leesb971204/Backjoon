//https://velog.io/@cjhlsb
class Solution {
    public int solution(int n) {
        String output = "";
        int answer = 0;
        while(n > 0){
            output  = (n % 3)+output;
            n /= 3;
        }
        for(int i=0;i<output.length();i++)
        {
            answer += (Character.getNumericValue(output.charAt(i)) * ((int)Math.pow(3, i)));
        }
        return answer;
    }
}
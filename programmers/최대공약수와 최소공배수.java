class Solution {
    public int[] solution(int a, int b) {
        int[] answer = new int[2];
        int min = (a < b) ? a : b;
		int gcd = 0;
		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
        answer[0] = gcd;
        answer[1] = a*b/gcd;
        return answer;
    }
}
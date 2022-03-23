class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int minCnt = 0;
		int maxCnt = 0;
		int[] answer = new int[2];
		for(int i=0;i<lottos.length;i++)
		{
			if(lottos[i] != 0) {
				for(int j=0;j<win_nums.length;j++)
				{
					if(lottos[i] == win_nums[j]) {
						minCnt++;
						break;
					}
				}
			}
			else
				maxCnt++;
		}
		switch(minCnt){
			case 6:
				answer[1] = 1;
				break;
			case 5:
				answer[1] = 2;
				break;
			case 4:
				answer[1] = 3;
				break;
			case 3:
				answer[1] = 4;
				break;
			case 2:
				answer[1] = 5;
				break;
			default:
				answer[1] = 6;
				break;
		}
		if(answer[1] == 1)
			answer[0] = 1;
		else {
			answer[0] = answer[1] - maxCnt;
			if(answer[0] == 0)
				answer[0]++;
		}
        return answer;
    }
}
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int x1 = 3;
		int y1 = 0;
		//왼손 좌표
		int x2 = 3;
		int y2 = 2;
		//오른손 좌표
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				x1 = (numbers[i]-1) / 3;
				y1 = (numbers[i]-1) % 3;
			}
			else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				x2 = (numbers[i]-1) / 3;
				y2 = (numbers[i]-1) % 3;
			}
			else {
                if(numbers[i] == 0)
					numbers[i] = 11;
                //0은 11로 치환
				int tmpX = numbers[i] / 3;
				int tmpY = 1;
				//가운데 패드 숫자 좌표
				if(Math.abs(tmpX - x1) + Math.abs(tmpY - y1) == Math.abs(tmpX - x2) + Math.abs(tmpY - y2)) {
					if(hand.equals("right")) {
						answer += "R";
						x2 = tmpX;
						y2 = tmpY;
					}
					else {
						answer += "L";
						x1 = tmpX;
						y1 = tmpY;
					}
				}
				else if(Math.abs(tmpX - x1) + Math.abs(tmpY - y1) > Math.abs(tmpX - x2) + Math.abs(tmpY - y2)){
					answer += "R";
					x2 = tmpX;
					y2 = tmpY;
				}
				else {
					answer += "L";
					x1 = tmpX;
					y1 = tmpY;
				}
			}
		}
        return answer;
    }
}
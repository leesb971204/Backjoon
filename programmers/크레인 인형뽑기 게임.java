import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<moves.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[j][moves[i]-1] != 0){ //현재 board줄에 인형이 있으면 바구니에 넣고 다음 moves 검사
                    st.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;   
                }
                //인형이 없으면 다음 줄로 이동
            }
            
            if(!st.isEmpty() && st.size() > 1){ //바구니에 인형이 2개 이상 있으면
                int tmp = st.pop();
                if(tmp == st.peek()){ //인형 2개를 비교해서 같으면 터트리고 카운트 증가
                    st.pop();
                    answer += 2;   
                }
                else //인형 2개가 다르면 다시 냅둔다
                    st.push(tmp);
            }
        }
        return answer;
    }
}
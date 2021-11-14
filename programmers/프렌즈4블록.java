class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];
        for (int i = 0; i < board.length; i++)
            map[i] = board[i].toCharArray();
        boolean flag=true;
        while (flag) {
            flag = false;
            boolean[][] visit = new boolean[m][n];
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if(map[i][j] == 'X')
                        continue;
                    if (map[i][j] == map[i + 1][j] && map[i][j] == map[i][j + 1] && map[i][j] == map[i + 1][j + 1]) {
                        visit[i][j] = true;
                        visit[i + 1][j] = true;
                        visit[i][j + 1] = true;
                        visit[i + 1][j + 1] = true;
                        flag = true;
                    }
                }
            }
            if(flag) {
                for(int i=0;i<m;i++) {
                    for(int j=0;j<n;j++) {
                        if(visit[i][j]) {
                            answer++;
                            map[i][j] = 'X';
                        }
                    }
                }
                for(int j=0;j<n;j++) {
                    String tmp = "";
                    for(int i=m-1;i>=0;i--) {
                        if(map[i][j]!='X')
                            tmp += map[i][j];
                    }
                    for(int i=m-1;i>=0;i--) {
                        if(tmp.length()>0) {
                            map[i][j] = tmp.charAt(0);
                            tmp = tmp.substring(1);
                        }else {
                            map[i][j] = 'X';
                        }
                    }
                }
            }else {
                break;
            }
        }
        return answer;
    }
}
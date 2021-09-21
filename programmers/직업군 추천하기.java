class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int[] pr = new int[table.length]; //직업군별 점수 저장
        String[] a = new String[table.length]; //직업 이름 저장
        for(int i=0;i<table.length;i++)
        {
            String[] arr = table[i].split(" "); //i번째 직업군 점수 저장
            int score = 5;
            for(int j=1;j<arr.length;j++)
            {
                for(int k=0;k<languages.length;k++)
                {
                    if(languages[k].equals(arr[j])){
                        pr[i] += score * preference[k];
                    }
                }
                score--;
            }
            a[i] = arr[0]; //직업 이름만 따옴
        }
        int max = 0;
        int index = 0;
        for(int i=0;i<pr.length;i++)
        {
            if(pr[i] > max){
                max = pr[i];
                index = i;
            }
            else if(pr[i] == max){
                if(a[i].compareTo(a[index]) < 0){ //사전순서 비교
                    max = pr[i];
                    index = i;
                }
                else if(a[i].compareTo(a[index]) > 0){ //사전순서 비교
                    max = pr[index];
                }
            }
        }
        answer = a[index];
        return answer;
    }
}
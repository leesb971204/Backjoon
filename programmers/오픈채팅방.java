import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<record.length;i++)
        {
            String[] arr = record[i].split(" ");
            if(arr[0].equals("Enter") || arr[0].equals("Change")){
                map.put(arr[1],arr[2]);
            }
        }
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<record.length;i++)
        {
            String[] arr = record[i].split(" ");
            if(arr[0].equals("Enter")){
                list.add(map.get(arr[1]) + "님이 들어왔습니다.");
            }
            else if(arr[0].equals("Leave")){
                list.add(map.get(arr[1]) + "님이 나갔습니다.");
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
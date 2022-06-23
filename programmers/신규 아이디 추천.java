class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z\\d\\-_.]","");
        answer = answer.replaceAll("[.]{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");
        if(answer.length() == 0)
            answer = "a";
        if(answer.length() > 15)
            answer = answer.substring(0,15);
        answer = answer.replaceAll("[.]$","");
        while(answer.length() <= 2){
            answer += answer.charAt(answer.length()-1);
            
        }
        return answer;
    }
}
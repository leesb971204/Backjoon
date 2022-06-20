class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] number = new int[3];
        String[] bonus = new String[3];
        int numLen = 0;
        int bonLen = 0;
        for(int i=0;i<dartResult.length();i++)
        {
            if(Character.isDigit(dartResult.charAt(i))){
                if(i > 0 && Character.isDigit(dartResult.charAt(i-1))){
                number[numLen-1] = 10;
                }
                else{
                    number[numLen] = Character.getNumericValue(dartResult.charAt(i));
                    numLen++;
                }
            }
            else if(Character.isAlphabetic(dartResult.charAt(i))){
                bonus[bonLen] = Character.toString(dartResult.charAt(i));
                bonLen++;   
            }
            else
                bonus[bonLen-1] += Character.toString(dartResult.charAt(i));
        }
        
        for(int i=0;i<bonus.length;i++)
        {
            if(bonus[i].length() == 1){ //옵션 미포함
                if(bonus[i].equals("D")){
                    number[i] = (int)Math.pow(number[i],2);
                }
                else if(bonus[i].equals("T")){
                    number[i] = (int)Math.pow(number[i],3);
                }
            }
            else{ //옵션 포함
                if(bonus[i].charAt(0) == 'D'){
                    number[i] = (int)Math.pow(number[i],2);
                }
                if(bonus[i].charAt(0) == 'T'){
                    number[i] = (int)Math.pow(number[i],3);
                }
                if(bonus[i].charAt(1) == '#'){
                    number[i] *= -1;
                }
                if(bonus[i].charAt(1) == '*'){
                    if(i == 0){
                        number[i] *= 2;
                    }
                    else{
                        number[i] *= 2;
                        number[i-1] *= 2;
                    }
                }
            }
        }
        for(int i=0;i<number.length;i++)
        {
            answer += number[i];
        }
        
        return answer;
    }
}
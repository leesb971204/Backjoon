class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
	 StringBuilder sb;
	 for(int i=0;i<n;i++)
	 {
		 String binary = Integer.toBinaryString((arr1[i] | arr2[i]));
		 if(binary.length() < n) {
			 while(binary.length() < n) {
				 binary = "0" + binary;
			 }
		 }
		 answer[i] = binary;
		 
		 for(int j=0;j<answer[i].length();j++)
		 {
			 sb = new StringBuilder(answer[i]);
			 if(sb.charAt(j) == '0')
				 sb.setCharAt(j, ' ');
			 else
				 sb.setCharAt(j, '#');
			 
			 answer[i] = sb.toString();
		 }
		 
	 }
        return answer;
    }
}
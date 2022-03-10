class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        
        for(int i=0;i<arr.length;i++)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(arr[i]);
			for(int j=0;j<arr[i].length();j++)
			{
				sb.setCharAt(j, j % 2 == 0 ? Character.toUpperCase(arr[i].charAt(j)) : Character.toLowerCase(arr[i].charAt(j)));
			}
			arr[i] = i != arr.length-1 ? sb.toString()+ " " : sb.toString();
			sb.setLength(0);
		}
        
        for(String i : arr)
        {
            answer += i;
        }
        return answer;
    }
}
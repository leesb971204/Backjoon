class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
    	int cnt = arr.length;
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=0;j<brokenLetters.length();j++)
    		{
    			if(arr[i].contains(Character.toString(brokenLetters.charAt(j)))) {
    				cnt--;
    				break;
    			}
        			
    		}
    	}
        return cnt;
    }
}
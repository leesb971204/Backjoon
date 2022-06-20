class Solution {
    public boolean solution(int x) {
        int sum = 0;
	    String b = String.valueOf(x);
    	for(int i=0;i<=b.length();i++)
    	{
    		sum += x % Math.pow(10, i) / Math.pow(10, i-1);
    	}
        return x % sum == 0 ? true : false;
    }
}
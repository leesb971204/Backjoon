class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a = 0;
        for(int i=0;i<operations.length;i++)
    	{
    		if(operations[i].charAt(0) == '+')
    			++a;
    		else if(operations[i].charAt(0) == '-')
    			--a;
    		else if(operations[i].charAt(1) == '+')
    			++a;
    		else
    			--a;
    	}
        return a;
    }
}
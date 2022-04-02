class Solution {
    public boolean areOccurrencesEqual(String s) {
        boolean flag = true;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		int cnt = map.get(s.charAt(0));
		
		for(char i : map.keySet())
		{
			if(map.get(i) != cnt) {
				flag = false;
				break;
			}
		}
        return flag;
    }
}
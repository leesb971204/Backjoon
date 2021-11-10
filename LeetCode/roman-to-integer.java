class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
		int sum = 0;
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		for(int i=0;i<s.length();i++)
		{
			if(i+1 != s.length()) { //배열 인덱스 초과 방지
			    if((map.get(s.charAt(i)) < (map.get(s.charAt(i+1))))) {
                    sum += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
				    i++;
			}
			    else
				    sum += map.get(s.charAt(i));
			}
			else
				sum += map.get(s.charAt(i));
		}
        
        return sum;
    }
}
//https://velog.io/@cjhlsb
class Solution {
    public boolean rotateString(String s, String goal) {
        boolean flag = false;
		
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			list.add(s.charAt(i));
		}
		
		for(int i=0;i<s.length();i++)
		{
			String tmp = list.toString().replaceAll(",","");
			tmp = tmp.substring(1,tmp.length()-1).replaceAll(" ", "");
			if(tmp.equals(goal)) {
				flag = true;
				break;
			}
			
			list.add(list.remove(0));
		}
        return flag;
    }
}
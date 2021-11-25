//https://velog.io/@cjhlsb
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag = true;
        if(Character.isLowerCase(word.charAt(0))) {
			for(int i=1;i<word.length();i++)
			{
				if(Character.isUpperCase(word.charAt(i)))
					flag = false;
			}
		}
		else {
			if(word.substring(1).equals(word.substring(1).toUpperCase()) || word.substring(1).equals(word.substring(1).toLowerCase()))
				flag = true;
			else
				flag = false;
		}
        return flag;
    }
}
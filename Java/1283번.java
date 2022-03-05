import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		boolean[] alp = new boolean[26];
		sc.nextLine();
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextLine();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].contains(" ")) {
				boolean flag = false;
				String[] s = arr[i].split(" ");
				for(int j=0;j<s.length;j++)
				{
					if(alp[Character.toUpperCase(s[j].charAt(0)) - 65] == false) {
						alp[Character.toUpperCase(s[j].charAt(0)) - 65] = true;
						s[j] = "[" + s[j].substring(0,1) + "]" + s[j].substring(1);
						flag = true;
						break;
					}
				}
				arr[i] = String.join(" ", s);
				
				if(!flag) {
					for(int j=0;j<arr[i].length();j++)
					{
						if(arr[i].charAt(j) != ' ') {
						if(alp[Character.toUpperCase(arr[i].charAt(j)) - 65] == false) { 
							alp[Character.toUpperCase(arr[i].charAt(j)) - 65] = true;
							arr[i] = arr[i].substring(0,j) + "[" + arr[i].substring(j,j+1) + "]" + arr[i].substring(j+1);
							break;
						}
						}
					}
				}
			}
			else {
				for(int j=0;j<arr[i].length();j++)
				{
					if(alp[Character.toUpperCase(arr[i].charAt(j)) - 65] == false) { 
						alp[Character.toUpperCase(arr[i].charAt(j)) - 65] = true;
						arr[i] = arr[i].substring(0,j) + "[" + arr[i].substring(j,j+1) + "]" + arr[i].substring(j+1);
						break;
					}
				}
			}
		}
		for(String i : arr)
		{
			System.out.println(i);
		}
		
		
	}
}

import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");
		Map<String, String> map = new HashMap<>();
		for(int i=0;i<Integer.parseInt(input[0]);i++)
		{
			String[] arr = br.readLine().split(" ");
			map.put(arr[0], arr[1]);
		}
		for(int i=0;i<Integer.parseInt(input[1]);i++)
		{
			String link = br.readLine();
			bw.write(map.get(link)+"\n");
		}
		bw.flush();
		bw.close();
 }
}

import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String,String> car = new HashMap<>();
	    Map<String,Integer> time = new TreeMap<>();
        car.put(records[0].substring(6,10),records[0].substring(0,5));
        for(int i=1;i<records.length;i++)
        {
           String[] list = records[i].split(" ");
            if(car.containsKey(list[1])){ //입차 후 출차
        	 int a = time.getOrDefault(list[1], 0) + getTimes(car.get(list[1]),list[0]);
        	 time.put(list[1], a);
        	 car.remove(list[1]);
            }
         else //입차
        	 car.put(list[1],list[0]); 
        }
     if(car.size() > 0) { //입차 기록만 있는 차
    	 Iterator<String> keys = car.keySet().iterator();
    	 while( keys.hasNext() ){
    		 String key = keys.next();
    		 time.put(key, time.getOrDefault(key, 0) + getTimes(car.get(key),"23:59"));
    		 }
     }
         ArrayList<Integer> list = new ArrayList<>();
		for (String nKey : time.keySet())
		{
			int times = time.get(nKey);
			if(times <= fees[0])
				list.add(fees[1]);
			else {
				int a = ((times-fees[0]) % fees[2]);
				int b = ((times-fees[0]) / fees[2]);
				if(a > 0)
					list.add((fees[1] + (b+1)  * fees[3]));
				else
					list.add((fees[1] + b  * fees[3]));
			}
		}
        
        int[] answer= new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
 int getTimes(String time1, String time2)
 {
 	 int hour = Integer.parseInt(time2.substring(0,2)) - Integer.parseInt(time1.substring(0, 2));
 	 int min = Integer.parseInt(time2.substring(3,5)) - Integer.parseInt(time1.substring(3, 5));
 	 return hour * 60 + min;
 }
}
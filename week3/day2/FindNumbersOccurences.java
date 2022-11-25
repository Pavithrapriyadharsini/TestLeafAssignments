package week3.day2;

import java.util.TreeMap;
import java.util.Map;

public class FindNumbersOccurences {

	public static void main(String[] args) {
		
		int[] input= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> numOccurence=new TreeMap<Integer, Integer>();
		
		for(int i=0;i<input.length;i++) {
		
			if(numOccurence.containsKey(input[i]))
			{
				int value=numOccurence.get(input[i]);
				numOccurence.put(input[i],value+1);
			}
			else {
				numOccurence.put(input[i],1);
			}
		}
		System.out.println(numOccurence);
		

	}

}

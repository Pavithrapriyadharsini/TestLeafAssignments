package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input="We learn java basics as part of java sessions in java week1";
		
		Set<String> uniqueString=new LinkedHashSet<String>();
		
		for (String string : input.split(" ")) {
			uniqueString.add(string);
		}
		
		System.out.println(uniqueString);
		
	}

}

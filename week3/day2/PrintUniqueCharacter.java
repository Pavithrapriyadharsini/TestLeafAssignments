package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
	
		String name="Pavithra priyadharsini";
		Set<Character> inputSet=new LinkedHashSet<Character>();
		Set<Character> duplicateChar=new LinkedHashSet<Character>();
		
		char[] charArray=name.toLowerCase().toCharArray();
		
		for (char c : charArray) {
			
			if(!inputSet.add(c)) {
				duplicateChar.add(c);
			}
			
		}
		for (char c : duplicateChar) {
			
			inputSet.remove(c);
		}
		System.out.println(inputSet);

	}

}

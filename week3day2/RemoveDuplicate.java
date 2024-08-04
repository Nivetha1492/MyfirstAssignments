package week3day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String given ="google";
		given.toCharArray();
		
		Set<Character> uniquechar = new TreeSet<Character>();
		
		for(int i=0; i<given.length(); i++)
		{
			uniquechar.add(given.charAt(i));
			
		}
		
		System.out.println("Unique Character:" +uniquechar);
	}

}

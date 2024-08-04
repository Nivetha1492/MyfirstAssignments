package week3day2;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		//TreeSet - ASCII order
		Set<String> mentors = new TreeSet<String>();
		
		//To add elements
		mentors.add("john");
		mentors.add("nivetha");
		mentors.add("suzana");
		mentors.add("Riju");
		mentors.add("Riya");
		
		System.out.println(mentors);
		
		//remove an element
		
		mentors.remove("nivetha");
		
		System.out.println("set after removing nivetha:" +mentors);
		
		int sizeofset = mentors.size();
		System.out.println(sizeofset);
	}

}

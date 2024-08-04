package week3day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnHashSet {

	public static void main(String[] args) {

		//Hash - random order
		Set<String> staffs = new HashSet<String>();
		
		System.out.println("before adding:" +staffs);
		
		//To add elements
				staffs.add("saranya");
				staffs.add("deepa");
				staffs.add("priya");
				staffs.add("gnanam");
				
		System.out.println("after adding:" +staffs);
				
		//to retrive an element
		//convert the set into list - move all elements from set to list
		
		List<String> trainers = new ArrayList<String>(staffs);
		System.out.println("After moving:" +trainers);
		
		String firstindex = trainers.get(0);
		System.out.println("First Index Value:" +firstindex);
		
		System.out.println("List name are:" +trainers);
		
		//for each loop
		
		//data type  new variable   variable already data was stored
		for(String   staffname:     trainers)
			
		{
			System.out.println("All value:" +staffname);
		}
		
				
				
	}

}

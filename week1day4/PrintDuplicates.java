package week1day4;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] num = {2,5,7,7,5,9,2,3};
		
		Arrays.sort(num);
		
		System.out.println(num);
		
		int arraylength =num.length;
		
		System.out.println("The length of Array is " + arraylength);
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length-1;i++)
			
			
		{
			if(num[i]==num[i+1])
			{
				System.out.println("duplicate value is" +num[i]);
			}
		}
	}

}

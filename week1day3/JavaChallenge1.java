package week1day3;

public class JavaChallenge1 {

	public static void main(String[] args) {

		String input = "fly me to the moon";
		String iArray[] = input.split(" ");
		int iLength = iArray.length-1;
		String output = iArray[iLength];
		int countResult = output.length();
		
		System.out.println(output);
		System.out.println(countResult);
		
		
		
		
	}

}

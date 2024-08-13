package week3day1;

public class SBI implements RBI{

	@Override
	public void mandatoryKYC() {
		
		System.out.println("Aadhar card");
	}

	@Override
	public void withdrawlLimit() {
		
		System.out.println("10000");
		
	}
	
	public static void main(String[] args)
	
	{
		SBI sb = new SBI();
		sb.mandatoryKYC();
		sb.withdrawlLimit();
		
	}
	
	

}

package week3day1;

public class Amazon extends CanaraBank {
	
	
	@Override
	public void cashOnDelivery() {

		System.out.println("cash on Delivery");
	}

	@Override
	public void internetBanking() {
		
		System.out.println("internet banking");		
	}
	
	public void testClass()
	{
		System.out.println("Test class");
	}
	
	public static void main(String[] args) {
		
		Amazon obj = new Amazon();
		obj.cashOnDelivery();
		obj.upiPayments();
		obj.Test1();
		obj.testClass();
	

}
}
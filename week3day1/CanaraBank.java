package week3day1;

public abstract class CanaraBank implements Payments {
	
	
	@Override
	public void upiPayments() {//Implemented method from Payment class
		System.out.println("UPI Payments");
	}
	
	@Override
	public void cardPayments() {//Implemented method from Payment class
	}
	
	public void Test1() { //Created new method 
		System.out.println("Method implements");	
	}

}

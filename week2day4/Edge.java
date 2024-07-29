package week2day4;

public class Edge extends Browser {
	
	public void takeSnap() {
		
		System.out.println("take snapshot");
	}
	
	public void clearCookies() {
		
		System.out.println("clear cookies");
		
	}
	

	public static void main(String[] args) {

		Edge obj3 = new Edge();
		obj3.takeSnap();
		obj3.clearCookies();
		obj3.openURL();
		obj3.closeBrowser();
		obj3.navigateBack();
		
	}

}

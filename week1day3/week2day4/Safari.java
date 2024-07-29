package week2day4;

public class Safari extends Browser {

	
	public void readerMode() {
		System.out.println("reader mode");
	}
	
	public void fullScreenMode() {
		System.out.println("full screen mode");
	}
	
	public static void main(String[] args) {
		
		Safari obj4 = new Safari();
		obj4.readerMode();
		obj4.fullScreenMode();
		obj4.openURL();
		obj4.closeBrowser();
		obj4.navigateBack();
		
		System.out.println("Browser name is:"+obj4.browserName);
		System.out.println("Browser Version is:" +obj4.browserVersion);

	}

}

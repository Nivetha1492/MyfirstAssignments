package week2day4;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("open incognito window");
	}
	
	 public void clearCache() {
		 System.out.println("clear cache");
	 }

	public static void main(String[] args) {
		
		Chrome obj2 = new Chrome();
		obj2.openURL();
		obj2.closeBrowser();
		obj2.navigateBack();
	}

}

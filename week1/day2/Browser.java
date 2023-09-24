package week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser obj = new Browser();
		
		obj.launchBrowser(null);
		obj.loadURL();

	}
	
	public String launchBrowser(String browserName) {
		
		System.out.println("Browser launched successfully");
		return browserName;
		
	}
	
	public void loadURL() {
		
		System.out.println("Application url loaded successfully");
		
	}

}

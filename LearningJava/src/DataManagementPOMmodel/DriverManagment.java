package DataManagementPOMmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagment {

	ChromeDriver driver;
	
	public ChromeDriver GetDriver() {
		return driver;
	}
	
	public DriverManagment()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Preeti\\Libraries\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.redmine.org/");
		driver.manage().window().maximize();
	}
}

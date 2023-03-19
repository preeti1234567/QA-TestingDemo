package keywordDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import LocatorObject.ObjectDemo;
import datareadingfromexcel.DataFile;

public class Test1 {
	public static ChromeDriver driver;
	
	
	public static String Keyword_CaseVerificationWithAllThePositiveInputs() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Preeti\\Libraries\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.redmine.org/");
		driver.manage().window().maximize();
		
		String userLoggedIn=null;
		
//exceptions are caused due to logical error in the program		
//try catch blocks helps in handling the exception both at compile time and runtime execution
//throws exception handles the exception at compile time only		
	try {
		driver.findElement(ObjectDemo.Register).click();

		//driver.findElement(By.id("user_login")).sendKeys("Preeti5555");
		//driver.findElement(ObjectDemo.userLogin).sendKeys("Preeti5655");
		PageFactory.initElements(driver, ObjectDemo.class);
		ObjectDemo.loginTextBox.sendKeys(DataFile.readFile(1, 1));
		ObjectDemo.passwordTextBox.sendKeys("password");
		driver.findElement(By.id("user_password_confirmation")).sendKeys("password");
		driver.findElement(By.id("user_firstname")).sendKeys(DataFile.readFile(1, 1));
		driver.findElement(By.id("user_lastname")).sendKeys(DataFile.readFile(1, 1));
		driver.findElement(By.id("user_mail")).sendKeys(DataFile.readFile(1, 6));
		driver.findElement(By.name("commit")).click();
		String actualValue = driver.findElement(By.id("flash_notice")).getText();
		String expectedValue = "Your account has been activated. You can now log in.";
		if (expectedValue.equalsIgnoreCase(actualValue)) {
			System.out.println("Test has passed");
			DataFile.writeFile(1, 7, "Test Passed");
			
			
			
		} else {
			System.out.println("Test has failed");
		}
		
		
		userLoggedIn=  driver.findElement(By.xpath("//div[@id=\"loggedas\"]/a")).getText();
		driver.findElement(By.linkText("Sign out")).click();	
	System.out.println(userLoggedIn);
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("Test execution is not done due to some logical error in the program");
	
	}
	return userLoggedIn;
	
	}

}

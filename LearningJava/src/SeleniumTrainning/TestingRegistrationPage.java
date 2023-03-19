package SeleniumTrainning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import LocatorObject.ObjectDemo;
import datareadingfromexcel.DataFile;
//import org.openqa.selenium.edge.EdgeDriver;

public class TestingRegistrationPage {
	public static ChromeDriver driver;
	
	public TestingRegistrationPage(ChromeDriver dri){
		this.driver=dri ;
	}
	public String CaseVerificationWithAllThePositiveInputs() {
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
			DataFile.writeFile(4, 7, "Test Passed");
			
			
			
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
	public void testCaseVerificationWithEmptyLoginInput() {
		try {
			driver.findElement(By.linkText("Register")).click();

			driver.findElement(By.id("user_login")).sendKeys(" ");
			driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.id("user_password_confirmation")).sendKeys("password");
			driver.findElement(By.id("user_firstname")).sendKeys("Preeti5689");
			driver.findElement(By.id("user_lastname")).sendKeys("lastname");
			driver.findElement(By.id("user_mail")).sendKeys("Preeti7689@gmail.com");
			driver.findElement(By.name("commit")).click();
			String actualValue = driver.findElement(By.id("errorExplanation")).getText();
			
			
			if (actualValue.contains("Login cannot be blank")|| actualValue.contains("Login cannot be blank"))
			{
				System.out.println("Test has passed");
			} 
			else 
			{
				System.out.println("Test has failed");
			}
			driver.findElement(By.linkText("Sign out")).click();
	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("this is catch block with empty login input");
			}
		}
	
	
}

/*
 * System.setProperty("webdriver.edge.edgedriver",
 * "D:\\Preeti\\Libraries\\driver\\chromedriver_win32\\chromedriver.exe");
 * EdgeDriver driverEdge = new EdgeDriver();
 * driverEdge.get("https://www.redmine.org/"); driver.quit();
 */

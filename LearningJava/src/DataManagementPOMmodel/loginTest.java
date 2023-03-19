package DataManagementPOMmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumTrainning.TestingRegistrationPage;
import datareadingfromexcel.DataFile;

public class loginTest extends TestingRegistrationPage {
	static ChromeDriver localdriver;

	public loginTest(ChromeDriver driverfrombaseclass) {
		super(driverfrombaseclass);
		
		this.localdriver = driverfrombaseclass;
		
	}

	public void loginVerification(String userLoginName) {
		try {
			localdriver.findElement(By.xpath("//div[@id=\"account\"]/ul/li[1]/a")).click();
			localdriver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(userLoginName);
			localdriver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("password");
			localdriver.findElement(By.xpath("//div[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")).click();

			System.out.println("user has loggged in.....");

			String userLoggedIn = localdriver.findElement(By.xpath("//div[@id=\"loggedas\"]")).getText();

			System.out.println(userLoggedIn);
			localdriver.findElement(By.linkText("Sign out")).click();
			

		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is some logical error in the user sign in process");
		}
	}

}


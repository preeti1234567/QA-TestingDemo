package DataManagementPOMmodel;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumTrainning.TestingRegistrationPage;

public class RegistrationAndLoginVerification {

		public static void main(String[] args) {
		DriverManagment dm = new DriverManagment();
		ChromeDriver driver = dm.GetDriver();
		/*
		 * TestingRegistrationPage rp = new TestingRegistrationPage(driver);
		 * rp.CaseVerificationWithAllThePositiveInputs();
		 * 
		 * loginTest lt =new loginTest(driver); 
		 * lt.loginVerification();
		 * loginVerification(driver);
		 */	
		loginTest lt = new loginTest(driver);
		String userLoginName = lt.CaseVerificationWithAllThePositiveInputs();

		lt.loginVerification(userLoginName);

		 lt.testCaseVerificationWithEmptyLoginInput();
		 

		
		

	}

}

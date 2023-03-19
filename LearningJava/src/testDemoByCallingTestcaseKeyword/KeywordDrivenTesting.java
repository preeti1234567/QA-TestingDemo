package testDemoByCallingTestcaseKeyword;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Driver;
import java.time.Duration;
import java.util.LinkedList;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import datareadingfromexcel.DataFile;
import keywordDrivenTest.Test1;

public class KeywordDrivenTesting {
	
	private static void droppable() {
		WebDriverWait wait = new WebDriverWait(Test1.driver, Duration.ofSeconds(2000));
		Test1.driver.navigate().to("https://demoqa.com/droppable");
		;
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("draggable")));
		WebElement src =Test1.driver.findElement(By .id("draggable"));
		WebElement target = Test1.driver.findElement(By.id("droppable"));
		Actions cursor = new Actions(Test1.driver);
		cursor.dragAndDrop(src, target).build().perform();
		
		////div[@id=\"app\"]/div/div/div[2]/div/div[6]/div
		Test1.driver.navigate().to("https://demoqa.com");
		WebElement endpointForScrolling = Test1.driver.findElement(By.xpath("//div[@id=\"app\"]/div/div/div[2]/div/div[6]/div"));
		cursor.scrollToElement(endpointForScrolling).perform();
	}

	private static void captureScreenshot() {

		try {
			File screenShotLocation = ((TakesScreenshot) Test1.driver).getScreenshotAs(OutputType.FILE);

			File myLocation = new File("D:\\MyTrainingWorkSpaceNew\\LearningJava\\screenshots");

			FileUtils.copyFileToDirectory(screenShotLocation, myLocation);
			System.out.println("screen shot has been taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Not executed1");
		}

	}

	public static void main(String[] args) {
		try {
			LinkedList<String> listOfClasses = new LinkedList<String>();
			File classPath = new File("D:\\Workspace\\LearningJava\\bin\\keywordDrivenTest");

			File[] classList = classPath.listFiles();

			for (File eachFile : classList) {

				listOfClasses.add(FilenameUtils.removeExtension(eachFile.getName()));
			}
			System.out.println(listOfClasses.size());
			System.out.println(listOfClasses);
			for (String listOfTestScripts : listOfClasses) {

				Class<?> className = Class.forName("keywordDrivenTest." + listOfTestScripts);
				Method[] listOfMethodsInClass = className.getMethods();
				System.out.println(listOfMethodsInClass);
				for (Method eachMethod : listOfMethodsInClass) {
					for (int rowNo = 1; rowNo <= 1; rowNo++) {
						String currentReadingRow = DataFile.readFile(rowNo, 9);
						String CurrentExecutionStatus = DataFile.readFile(rowNo, 8);

						if (eachMethod.getName().startsWith("Keyword_")
								&& eachMethod.getName().contains(currentReadingRow)
								&& CurrentExecutionStatus.equalsIgnoreCase("Yes"))
							;
						

						{
							System.out.println(eachMethod);
							eachMethod.invoke(null);
							break;
						}
					}
					captureScreenshot();
				}

			}

		} catch (Exception e) {
			System.out.println("Not executed");
		}
		droppable();
	}

}

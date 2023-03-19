package LocatorObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ObjectDemo {
	
public static	By Register = By.linkText("Register");
public static By userLogin=By.id("user_login");

@FindBy (id="user_login")
public static WebElement loginTextBox;

@FindBy (id="user_password")
public static WebElement passwordTextBox;

@FindBy (id="username")
public static WebElement loginInputBox;
//input[@id=\"username\
}

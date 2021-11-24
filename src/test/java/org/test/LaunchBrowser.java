package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sethu\\eclipse-workspace\\MavenDemo" );
	    WebDriver driver=new ChromeDriver();
	    
		//To launch URL
		driver.get("https://www.facebook.com/");
		
		// To get current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("to print the current url " +currentUrl);
		
		//To get title
		String title = driver.getTitle();
	    System.out.println(title);
	    
		//to find the locator
		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("sethu");
		
		WebElement password  = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		//To click the button
		WebElement clickbtn = driver.findElement(By.name("login"));
		clickbtn.click();
		
		
	
	}

}

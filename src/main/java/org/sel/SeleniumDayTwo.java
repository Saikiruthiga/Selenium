package org.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayTwo {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Welcome");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello@123");
		driver.findElement(By.className("submit")).click();
		// css selector locator---> tagname.classname / tagname#id / tagname[attribute ='value']
		Thread.sleep(2000);
		String text = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(text);
		
		
		
	}

}

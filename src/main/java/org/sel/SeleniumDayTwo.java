package org.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayTwo {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); --->wait for showing the text
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Welcome");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello@123");
		driver.findElement(By.className("submit")).click();
		// css selector locator---> tagname.classname / tagname#id / tagname[attribute ='value']
		//xpath syntax ---> //tagname[@attribute ='value']  and //tagname[text()='value']
		Thread.sleep(2000); // ----->user need to wait for accessing the element.
		String text = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//input[@type='text'][2])")).sendKeys("selenium@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder = 'Phone Number']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String text2 = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(text2);
		
		// Xpath always having "//" in its syntax. whereas css selector doesn't have.
		// css selector index ---> syntax : nth - child(2)
		
		
		
	}

}

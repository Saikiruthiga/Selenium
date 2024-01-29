package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayThree {
	
	public static void main(String args[]) {
		String name = "Selenium";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.tagName("label")).click();
		driver.findElement(By.xpath("//label[contains(text(),' I agree to')]")).click();
		driver.findElement(By.cssSelector("button[class = 'submit signInBtn']")).click();
		
	}

}

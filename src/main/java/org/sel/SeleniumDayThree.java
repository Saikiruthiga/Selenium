package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDayThree {
	
	public static void main(String args[]) throws InterruptedException {
		String name = "Selenium";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder = 'Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.tagName("label")).click();
		driver.findElement(By.xpath("//label[contains(text(),' I agree to')]")).click();
		driver.findElement(By.cssSelector("button[class = 'submit signInBtn']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//p[contains(text(),'You are successfully')]")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You are successfully logged in.");
		String text_1 = driver.findElement(By.cssSelector("div h2")).getText();
		System.out.println(text_1);
		Assert.assertEquals(text_1, "Hello " + name + ",");
	
		
	}

}

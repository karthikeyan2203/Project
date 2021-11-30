package com.riding;

import org.openqa.selenium.By;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe"); 
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement top = driver.findElement(By.xpath("//div[text()='Top Offers']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(top).build().perform();
		ac.contextClick(top).build().perform();
		Robot n = new Robot();
		
	}

}

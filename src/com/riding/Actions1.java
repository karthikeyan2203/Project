package com.riding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe"); 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
	    WebElement dr = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
	    Actions a =new Actions(driver);
	    a.moveToElement(dr).build().perform();
	    WebElement eve_dr = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
	    a.click(eve_dr).build().perform();
	}

}

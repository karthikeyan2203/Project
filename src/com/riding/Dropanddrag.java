package com.riding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropanddrag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe"); 
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/drop.html");
	    Thread.sleep(3000);
	    Actions s = new Actions(driver);
	    WebElement src = driver.findElement(By.id("draggable"));
	    WebElement trg = driver.findElement(By.id("droppable"));
	    s.dragAndDrop(src, trg).build().perform();
	}

}

package com.hai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monkey {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe");
        WebDriver n = new ChromeDriver();
        n.get("http://demo.automationtesting.in/Frames.html");
        n.manage().window().maximize();
        n.switchTo().frame("singleframe");
		WebElement b = n.findElement(By.xpath("(//input[@type='text'])[1]"));
		b.sendKeys("hello");
		n.switchTo().defaultContent();
		WebElement f = n.findElement(By.xpath("//a[text()='Iframe with in a Iframe"));
		f.click();
		WebElement outerframe = n.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		n.switchTo().frame("outerframe");
		  
		
	}

}

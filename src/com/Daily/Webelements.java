package com.Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
        a.get("https://www.instagram.com/");
        a.manage().window().maximize();
      //  WebElement b = a.findElement(By.name("username"));
        //b.sendKeys("hello");
}
}
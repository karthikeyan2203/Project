package com.heilping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe");
        WebDriver n = new ChromeDriver();
        n.get("https://www.facebook.com/");
        n.manage().window().maximize();
        n.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(3000);
        n.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sri");
        n.findElement(By.xpath("//input[@name='lastname']")).sendKeys("siva");
        n.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1234567893");
        n.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("world123");
        WebElement d = n.findElement(By.id("day"));
        Select s = new Select(d);
        s.selectByValue("22");
        WebElement m = n.findElement(By.id("month"));
        Select s1 = new Select(m);
        s1.selectByIndex(4);
        WebElement y = n.findElement(By.id("year"));
        Select s2 = new Select(y);
        s2.selectByVisibleText("1999");
        boolean o = s.isMultiple();
        System.out.println("mutiple 0r unmultiple=" +o);
        List<WebElement> j = s1.getOptions();
        for (WebElement webElement : j) {
        	String text = webElement.getText();
        	System.out.println(text);
        	
		}
        System.out.println();
        WebElement r = s2.getFirstSelectedOption();
    	System.out.println(r.getText());
		
        
        
        
	}

}

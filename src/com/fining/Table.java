package com.fining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe"); 
    ChromeOptions f= new ChromeOptions();
    f.addArguments("incognito");
	WebDriver driver =new ChromeDriver(f);
	driver.manage().window().maximize();
    driver.get("http://www.leafground.com/pages/table.html");
    Thread.sleep(3000);
    List<WebElement> a = driver.findElements(By.xpath("//table/tbody/tr/td"));
    for (WebElement webElement : a) {
    	String b = webElement.getText();
    	System.out.println(b);
		
	}
    System.out.println("------------row---------");
    List<WebElement> c = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
    for (WebElement webElement : c) {
    	String d = webElement.getText();
    	System.out.println(d);   
}
    System.out.println("-------column--------");
    List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
    for (WebElement h : column) {
    	String text = h.getText();
    	System.out.println(text);
		
	}
    System.out.println("-------particular--------");
    List<WebElement> par = driver.findElements(By.xpath("//table/tbody/tr[4]/td[2]"));
    for (WebElement m : par) {
    	String text = m.getText();
    	System.out.println(text);
		
	}
    
}
}

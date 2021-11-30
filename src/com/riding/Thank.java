package com.riding;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Thank {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe"); 
    ChromeOptions f= new ChromeOptions();
    f.addArguments("incognito");
    WebDriver n =new ChromeDriver(f);
    n.get("http://automationpractice.com/index.php?fc=module&module=cheque&controller=payment");
    n.manage().window().maximize();
    Thread.sleep(3000);
    TakesScreenshot m = (TakesScreenshot) n;
	JavascriptExecutor js = (JavascriptExecutor) n;
    js.executeScript("window.scrollBy(0'350;" );
    File source = m.getScreenshotAs(OutputType.FILE);
    File destination = new File("C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Screenshots\\pic3.png");
    FileUtils.copyFile(source, destination);
    
	}
}

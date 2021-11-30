package com.heilping;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Robot_Class {
	public static void main(String[] args) throws  InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe"); 
	    ChromeOptions f= new ChromeOptions();
	    f.addArguments("incognito");
		WebDriver driver =new ChromeDriver(f);
		driver.manage().window().maximize();
	    driver.get("http://automationpractice.com/index.php");
	    WebElement ab = driver.findElement(By.xpath("//a[@class='login']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(ab).click().build().perform();    
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("karthikeyan62303@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("srisiva@123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		Thread.sleep(5000);
	    WebElement shirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
	    a.moveToElement(shirts).click().build().perform();
	    driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")).click();
	    WebElement frames = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	    driver.switchTo().frame(frames);
	    driver.findElement(By.xpath("//button[@class='exclusive']")).click();
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    WebDriverWait wait =new WebDriverWait(driver, 60);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
	    WebElement ac = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	    a.moveToElement(ac).build().perform();
	    a.click(ac).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='cgv']")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,850);" );
	    driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,900);" );
	    driver.findElement(By.xpath("//a[@class='cheque']")).click();
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,900);" );
	    driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	    Thread.sleep(30000);
	    js.executeScript("window.scrollBy(0,350);" );
	    TakesScreenshot t=(TakesScreenshot) driver;
	    File source = t.getScreenshotAs(OutputType.FILE);
	    File d=new File("C:\\Users\\SelasMonica1\\eclipse-workspace\\Hello\\Screenshots\\pic4.png");
	    FileUtils.copyFile(source, d);  
		
		
		
		
	}


}

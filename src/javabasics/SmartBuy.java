package javabasics;

import java.util.List;
import java.util.Random;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmartBuy 
{
	
	WebDriver driver = new ChromeDriver();
	String myweb = "https://smartbuy-me.com/smartbuystore/ar/login";
	String firstName = "osama";
	String lastName = "sammar11"; 
	String pass = "osamasammar105";
	
	
	
	@BeforeTest
	
	public void mybefortest () throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@Test 
	
	public void mytest () throws InterruptedException 
	{
		
		
		String domain= ("@gmail.com");
		
		
		
		
		
		driver.get(myweb);		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/button/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[1]/div[1]/div/div/div/div/ul/li[3]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("register.firstName")).sendKeys("osama");
		Thread.sleep(1000);
		driver.findElement(By.id("register.lastName")).sendKeys("sammar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/button/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/div/ul/li[2]/a/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("dateOfBirth")).sendKeys("10/5/1998");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[3]/div/div/div/button/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[3]/div/div/div/div/ul/li[114]/a/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNumber")).sendKeys("788807640");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[7]/div/div/div/button/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("register.email")).sendKeys(firstName.concat(lastName)+ domain);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[1]/div[2]/div[7]/div/div/div/div/ul/li[24]/a/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.id("register.checkPwd")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.id("termsandconditions")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"kafRegisterForm\"]/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(1000);

		
	}
	
	@AfterTest
	
	public void after () throws InterruptedException 
	{
		Thread.sleep(2000);
//		driver.close();
		
		
	}
	
	
	
	
	
}

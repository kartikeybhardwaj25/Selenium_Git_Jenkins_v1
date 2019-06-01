package edu.org;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Selenium_Jenkins {
	private WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	
  @Test
  public void verifySearchButton() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  driver.get("https://www.amazon.in/");
		System.out.println("successful");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("PS4 Pro");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  

}

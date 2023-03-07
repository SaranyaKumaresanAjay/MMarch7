package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\TRB\\Selenium1\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.firstcry.com/m/login");
	 driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("saranyamkce@gmail.com");
	 
	 driver.findElement(By.xpath("//div[contains(@class,'B14_white ')]")).click();
	
	 

	 
	 
	 
	 
	 
	 
	 
}
}

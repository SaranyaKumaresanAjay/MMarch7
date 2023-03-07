package com.selenium.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver","D:\\TRB\\Selenium1\\driver\\chromedriver.exe");
         
		 WebDriver driver= new ChromeDriver();
	     
         driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	WebElement gmail = driver.findElement(By.name("email"));
	gmail.sendKeys("saran.rokz1992@gmail.com");
	
	WebElement passwrd = driver.findElement(By.name("pass"));
	passwrd.sendKeys("sdkhjhfnv");
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	driver.quit();
	
	

	
	
}
}
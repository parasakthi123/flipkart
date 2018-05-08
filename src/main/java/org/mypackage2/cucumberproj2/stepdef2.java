 package org.mypackage2.cucumberproj2;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

    public class stepdef2 {
	WebDriver driver;
	@Given("^the user is in flipkart website$")
	public void the_user_is_in_flipkart_website() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\cucumberproj2\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	}
	@When("^user added the five \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" in the cart$")
	public void user_added_the_five_in_the_cart(String mobile1, String mobile2, String mobile3, String mobile4, String mobile5) throws Throwable {
    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
    driver.findElement(By.name("q")).sendKeys(mobile1);
    driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    String pwid=driver.getWindowHandle();
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[@title='Apple iPhone X (Space Gray, 256 GB)']")).click();
    Set<String> childwid = driver.getWindowHandles(); 
    for(String x : childwid) {
    if(!pwid.equals(x)){
    driver.switchTo().window(x);
    }
    }
	driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//2nd iteration
	driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys(mobile2);
    driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    String pwid1=driver.getWindowHandle();
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[@title='Apple iPhone X (Space Gray, 64 GB)']")).click();
    Set<String> childwid1 = driver.getWindowHandles(); 
    for(String x : childwid1) {
    if(!pwid1.equals(x)){
    driver.switchTo().window(x);
    }
    }
	driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
	//3rd iteration
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys(mobile3);
	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String pwid2=driver.getWindowHandle();
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@title='Apple iPhone X (Silver, 64 GB)']")).click();
	Set<String> childwid2 = driver.getWindowHandles(); 
	for(String x : childwid2) {
	if(!pwid2.equals(x)){
	driver.switchTo().window(x);
	}
	}
    driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
    //4th iteration
    driver.findElement(By.name("q")).click();
  	driver.findElement(By.name("q")).sendKeys(mobile4);
  	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	String pwid3=driver.getWindowHandle();
  	driver.manage().window().maximize();
  	driver.findElement(By.xpath("//a[@title='Apple iPhone X (Silver, 256 GB)']")).click();
  	Set<String> childwid3 = driver.getWindowHandles(); 
  	for(String x : childwid3) {
  	if(!pwid3.equals(x)){
  	driver.switchTo().window(x);
  	}
  	}
    driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
  		
    //5th iteration
  	driver.findElement(By.name("q")).click();
  	driver.findElement(By.name("q")).sendKeys(mobile5);
  	driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	String pwid4=driver.getWindowHandle();
  	driver.manage().window().maximize();
  	driver.findElement(By.xpath("//a[@title='Apple iPhone 7 (Black, 32 GB)']")).click();
  	Set<String> childwid4 = driver.getWindowHandles(); 
  	for(String x : childwid4) {
  	if(!pwid4.equals(x)){
  	driver.switchTo().window(x);
  	}
  	}
    driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
  	}
	
	@Then("^user verifies the mobile items in cart$")
	public void user_verifies_the_mobile_items_in_cart() throws Throwable {
	Assert.assertEquals("MY CART (5)", driver.findElement(By.xpath("//span[@class='_1WMqsr']")).getText());
	}
	}

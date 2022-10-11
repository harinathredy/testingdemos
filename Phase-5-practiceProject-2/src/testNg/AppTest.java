package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest<WebDriver> {
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HARINATHREDDY\\\\Dropbox\\\\My PC (LAPTOP-I1PU30SC)\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	      ChromeDriver cd = new ChromeDriver();
		 
	      cd.manage().window().maximize();
	      cd.get("https://www.amazon.in/");
	      cd.findElement(By.id("nav-link-accountList")).click();
	      cd.findElement(By.id("createAccountSubmit")).click();
	      cd.findElement(By.id("ap_customer_name")).sendKeys("Harinathreddy");
	      cd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	      cd.findElement(By.id("ap_email")).sendKeys("harinath@gmail.com");
	      cd.findElement(By.id("ap_password")).sendKeys("12345");
	      cd.findElement(By.id("ap_password_check")).sendKeys("12345");
	      cd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		  
	      ChromeDriver cd=new ChromeDriver();
	      cd.manage().window().maximize();
	      cd.get("https://www.amazon.in/");
	      cd.findElement(By.id("nav-link-accountList")).click();
	      cd.findElement(By.id("ap_email")).sendKeys("harinath@gmail.com");
		  cd.findElement(By.id("continue")).click();
	      cd.findElement(By.id("ap_password")).sendKeys("12345");


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  	ChromeDriver cd=new ChromeDriver();
	      	cd.get("https://www.amazon.in/");
		    System.out.println(cd.getTitle());
		    System.out.println(cd.getCurrentUrl());
		    cd.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iphones");
		    Thread.sleep(5000);
		    cd.findElement(By.id("nav-search-submit-button")).submit();
		    cd.findElement(By.linkText("iphone 13 (starlight, 128GB Storage)")).click();
	        cd.findElement(By.id("add-to-cart-button")).click();
	  }
}
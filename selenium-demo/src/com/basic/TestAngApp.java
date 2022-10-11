package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAngApp {
	
	private static  String url = "http://localhost:4200";

	public static void main(String[] args) {
		
		WebDriver webdriver=null;
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		webdriver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		webdriver=new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		webdriver=new EdgeDriver();
		
		
		
		
//		clickAccountsButton(webdriver);
		
//		addProductToShoppingCart(webdriver, "ecomm", "bluetooth", "5" );
		
//		tformsEmailValidation(webdriver, "tforms", "Harinath");
		
		
		addProductToShoppingCartXPath(webdriver, "ecomm", "XPath", "4" );
		
		
		//webdriver.quit();
	}
	
	
	private static void tformsEmailValidation(WebDriver webdriver, String route,String username) {
		webdriver.get(url + "/" +route);
		webdriver.findElement(By.name("username")).sendKeys(username);
		webdriver.findElement(By.name("email")).click();
		webdriver.findElement(By.id("tforms_div")).click();
		System.out.println(webdriver.findElement(By.name("email_err")).getText());
		
		
	}

	private static void addProductToShoppingCartXPath(WebDriver webdriver,String route,String productname, String quantity) {
		webdriver.get(url + "/" +route);
		webdriver.findElement(By.name("productName")).sendKeys(productname);
		webdriver.findElement(By.name("quantity")).sendKeys(quantity);
		webdriver.findElement(By.name("addProduct")).click();
		webdriver.findElement(By.name("productName")).sendKeys("");
		webdriver.findElement(By.name("quantity")).sendKeys("");
	}

	private static void clickAccountsButton(WebDriver webdriver) {
		webdriver.get(url);
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
	    webdriver.findElement(By.id("accounts1")).click();
	}
	
}	
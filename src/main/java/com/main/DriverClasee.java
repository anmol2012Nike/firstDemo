package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClasee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		openBrowser();

	}

	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.com/");
		
		System.out.println("opening browser class done success");
		
		driver.quit();
	}
}

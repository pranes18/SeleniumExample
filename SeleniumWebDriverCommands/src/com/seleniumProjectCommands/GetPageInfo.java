package com.seleniumProjectCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageInfo {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String source= driver.getPageSource();
		System.out.println(source);
		driver.quit();
	}

}

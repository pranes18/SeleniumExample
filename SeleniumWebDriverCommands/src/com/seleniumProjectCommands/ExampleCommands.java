package com.seleniumProjectCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleCommands {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String title= driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		

}
	

}

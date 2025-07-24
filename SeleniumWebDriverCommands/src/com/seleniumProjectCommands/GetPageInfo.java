package com.seleniumProjectCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageInfo {

	 public static void main(String[] args) {
	        WebDriver driver1 = new ChromeDriver();
	        WebDriver driver2 = new ChromeDriver();
	        WebDriver driver3 = new ChromeDriver();
	        WebDriver driver4 = new ChromeDriver();
	        WebDriver driver5 = new ChromeDriver();

	        driver1.get("https://opensource-demo.orangehrmlive.com");
	        driver2.get("https://demo.opencart.com");
	        driver3.get("https://www.bing.com");
	        driver4.get("https://www.freecrm.com");
	        driver5.get("https://www.half.ebay.com");

	        String source1 = driver1.getPageSource();
	        String source2 = driver2.getPageSource();
	        String source3 = driver3.getPageSource();
	        String source4 = driver4.getPageSource();
	        String source5 = driver5.getPageSource();

	        System.out.println("Source 1 Length: " + source1);
	        System.out.println("Source 2 Length: " + source2);
	        System.out.println("Source 3 Length: " + source3);
	        System.out.println("Source 4 Length: " + source4);
	        System.out.println("Source 5 Length: " + source5);

	        driver1.quit();
	        driver2.quit();
	        driver3.quit();
	        driver4.quit();
	        driver5.quit();
	    }

}

package com.seleniumProjectCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleCommands {
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

	        String title1 = driver1.getTitle();
	        String title2 = driver2.getTitle();
	        String title3 = driver3.getTitle();
	        String title4 = driver4.getTitle();
	        String title5 = driver5.getTitle();

	        System.out.println("Title 1: " + title1);
	        System.out.println("Title 2: " + title2);
	        System.out.println("Title 3: " + title3);
	        System.out.println("Title 4: " + title4);
	        System.out.println("Title 5: " + title5);

	        driver1.quit();
	        driver2.quit();
	        driver3.quit();
	        driver4.quit();
	        driver5.quit();
	    }

}

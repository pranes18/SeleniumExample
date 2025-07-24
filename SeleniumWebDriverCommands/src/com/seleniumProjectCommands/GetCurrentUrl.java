package com.seleniumProjectCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

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

        String url1 = driver1.getCurrentUrl();
        String url2 = driver2.getCurrentUrl();
        String url3 = driver3.getCurrentUrl();
        String url4 = driver4.getCurrentUrl();
        String url5 = driver5.getCurrentUrl();

        System.out.println("URL 1: " + url1);
        System.out.println("URL 2: " + url2);
        System.out.println("URL 3: " + url3);
        System.out.println("URL 4: " + url4);
        System.out.println("URL 5: " + url5);

        driver1.quit();
        driver2.quit();
        driver3.quit();
        driver4.quit();
        driver5.quit();
    }
	
}

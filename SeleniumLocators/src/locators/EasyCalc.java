package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EasyCalc {

	WebDriver driver;
	
	@Test
	public void Demo() {
		
		driver=new ChromeDriver();
		driver.get("https://www.easycalculation.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		driver.switchTo().frame("googleSearchFrame");
        WebElement firstLink = driver.findElement(By.cssSelector(".gsc-result .gs-title a"));
        firstLink.click();
}
}
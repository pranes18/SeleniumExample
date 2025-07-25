package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	
	public static void main(String []args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String URL = driver.getCurrentUrl();
        String source=driver.getPageSource();
        System.out.println(URL);
        
        //opensource
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        source = driver.getPageSource();
        System.out.println(source);
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        
        //opencart
        driver.navigate().to("https://demo.opencart.com/");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        source = driver.getPageSource();
        System.out.println(source);
        driver.navigate().refresh();
        driver.navigate().back();

        driver.navigate().forward();
        
        //bing
        
        driver.navigate().to("https://www.bing.com/");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        source = driver.getPageSource();
        System.out.println(source);
        driver.navigate().refresh();
        driver.navigate().back();

        driver.navigate().forward();
        
        //freecrm
        driver.navigate().to("https://www.freecrm.com/");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        source = driver.getPageSource();
        System.out.println(source);
        driver.navigate().refresh();
        driver.navigate().back();

        driver.navigate().forward();
        
        //ebay
        driver.navigate().to("http://www.half.ebay.com");
        URL = driver.getCurrentUrl();
        System.out.println(URL);
        source = driver.getPageSource();
        System.out.println(source);
        driver.navigate().refresh();
        driver.navigate().back();

        driver.navigate().forward();
        
        
}
	
}

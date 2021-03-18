import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class showdate {

	@Test
	void showdate() throws InterruptedException {
		WebDriver driver = null;
		String browser = "firefox";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toey\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Toey\\Desktop\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
		driver.get("http://localhost/calculator/");
	    driver.manage().window().setSize(new Dimension(899, 825));
	    driver.findElement(By.id("month")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("month"));
	      dropdown.findElement(By.xpath("//option[. = 'April']")).click();
	    }
	    driver.findElement(By.id("month")).click();
	    driver.findElement(By.id("day")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("day"));
	      dropdown.findElement(By.xpath("//option[. = '6']")).click();
	    }
	    driver.findElement(By.id("day")).click();
	    driver.findElement(By.id("wtf")).click();
	    driver.findElement(By.cssSelector("html")).click();
	    driver.findElement(By.cssSelector("body")).click();
	    
        Thread.sleep(4000);
	    String result = driver.findElement(By.id("showdate")).getText();
        assertEquals("Tuesday",result);
        driver.close();

	}

}

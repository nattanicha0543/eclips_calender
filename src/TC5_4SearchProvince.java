
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TC5_4SearchProvince {

	@Test //pass
	void TC101() throws InterruptedException {
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
		driver.get("http://localhost/alumni_pro2/index.php/Page2/search");
	    driver.manage().window().setSize(new Dimension(1020, 824));
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("นครปฐม");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    
	    String result = driver.findElement(By.id("account")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("ข้อมูลคนที่ลงทะเบียน",result);
        System.out.print("search Successfully");
        
	}
	
	@Test //pass
	void TC102() throws InterruptedException {
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
		driver.get("http://localhost/alumni_pro2/index.php/Page2/search");
	    driver.manage().window().setSize(new Dimension(1020, 824));
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("สุรินทร์");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    
	    String result = driver.findElement(By.id("account")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("ข้อมูลคนที่ลงทะเบียน",result);
        System.out.print("search Successfully");
	}
	
	@Test //error
	void TC103() throws InterruptedException {
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
		driver.get("http://localhost/alumni_pro2/index.php/Page2/search");
	    driver.manage().window().setSize(new Dimension(1020, 824));
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("ราชบุรี");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    
	    String result = driver.findElement(By.id("account")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("ข้อมูลคนที่ลงทะเบียน",result);
        System.out.print("search Successfully");
	}
}

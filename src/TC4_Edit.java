
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class TC4_Edit {

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
		driver.get("http://localhost/alumni_pro2/index.php/page2/index");
	    driver.manage().window().setSize(new Dimension(1367, 824));
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("stu_id")).click();
	    driver.findElement(By.id("stu_id")).sendKeys("614259048");
	    driver.findElement(By.id("password")).click();
	    
	    driver.findElement(By.id("password")).sendKeys("12300");
	    driver.findElement(By.name("submit")).click();
	    driver.findElement(By.id("dropdownMenu1-1")).click();
	    driver.findElement(By.linkText("ตั้งค่าบัญชีส่วนตัว")).click();
	    driver.findElement(By.cssSelector(".peach-gradient")).click();
	    driver.findElement(By.id("p_num")).click();
	    driver.findElement(By.id("p_num")).sendKeys("1700401319982");
	    driver.findElement(By.cssSelector(".btn-default")).click();
	    driver.findElement(By.id("profile")).click();
	    
	    String result = driver.findElement(By.id("profile")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("ข้อมูลส่วนตัว",result);
        System.out.print("UC2login Successfully");
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
		driver.get("http://localhost/alumni_pro2/index.php/page2/index");
	    driver.manage().window().setSize(new Dimension(1367, 824));
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("stu_id")).click();
	    driver.findElement(By.id("stu_id")).sendKeys("614259012");
	    driver.findElement(By.id("password")).click();
	    
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.name("submit")).click();
	    driver.findElement(By.id("dropdownMenu1-1")).click();
	    driver.findElement(By.linkText("ตั้งค่าบัญชีส่วนตัว")).click();
	    driver.findElement(By.cssSelector(".peach-gradient")).click();
	    driver.findElement(By.id("p_num")).click();
	    driver.findElement(By.id("p_num")).sendKeys("1700401319982");
	    driver.findElement(By.cssSelector(".btn-default")).click();
	    driver.findElement(By.id("profile")).click();
	    
	    String result = driver.findElement(By.id("profile")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("ข้อมูลส่วนตัว",result);
        System.out.print("UC2login Successfully");
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
		driver.get("http://localhost/alumni_pro2/index.php/page2/index");
	    driver.manage().window().setSize(new Dimension(1367, 824));
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("stu_id")).click();
	    driver.findElement(By.id("stu_id")).sendKeys("614259041");
	    driver.findElement(By.id("password")).click();
	    
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.name("submit")).click();
	    driver.findElement(By.id("dropdownMenu1-1")).click();
	    driver.findElement(By.linkText("ตั้งค่าบัญชีส่วนตัว")).click();
	    driver.findElement(By.cssSelector(".peach-gradient")).click();
	    driver.findElement(By.id("p_num")).click();
	    driver.findElement(By.id("p_num")).sendKeys("1700401319982");
	    driver.findElement(By.cssSelector(".btn-default")).click();
	    driver.findElement(By.id("profile")).click();
	    
	    String result = driver.findElement(By.id("profile")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("ข้อมูลส่วนตัว",result);
        System.out.print("UC2login Successfully");
	
	}
}

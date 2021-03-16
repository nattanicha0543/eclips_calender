
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TC2_Login {

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
		    driver.manage().window().setSize(new Dimension(1019, 824));
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.id("stu_id")).click();
		    driver.findElement(By.id("stu_id")).sendKeys("614259048");
		    driver.findElement(By.id("password")).click();
		    
		    driver.findElement(By.id("password")).sendKeys("12300");
		    driver.findElement(By.name("submit")).click();
		    driver.findElement(By.id("dropdownMenu1-1")).click();
		    driver.findElement(By.linkText("ตั้งค่าบัญชีส่วนตัว")).click();
		    driver.findElement(By.cssSelector("h1")).click();
		    driver.findElement(By.cssSelector(".modal-body:nth-child(5) > .form-row:nth-child(1) > .col:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".modal-body:nth-child(5) > .form-row:nth-child(1) > .col:nth-child(1)")).click();
		    
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
		driver.get("http://localhost/alumni_pro2/");
	    driver.manage().window().setSize(new Dimension(1047, 824));
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("stu_id")).click();
	    driver.findElement(By.id("stu_id")).sendKeys("614259012");
	    driver.findElement(By.cssSelector(".modal-body")).click();
	    driver.findElement(By.id("password")).click();
	   
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.name("submit")).click();
	   
	    driver.findElement(By.id("dropdownMenu1-1")).click();
	   
	    driver.findElement(By.linkText("ตั้งค่าบัญชีส่วนตัว")).click();
	    driver.findElement(By.cssSelector(".text-center")).click();
	    
	    String result = driver.findElement(By.id("profile")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("ข้อมูลส่วนตัว",result);
        System.out.print("UC2login Successfully");
	    
	    
}
	@Test //error
	public void TC103() throws InterruptedException {
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
		driver.get("http://localhost/alumni_pro2/");
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.id("stu_id")).click();
	   
	    driver.findElement(By.id("stu_id")).sendKeys("614259012");
	    driver.findElement(By.name("submit")).click();
	    String result = driver.findElement(By.id("login")).getText();
        Thread.sleep(4000);
        driver.close();
        assertEquals("Login",result);
        System.out.print("UC2login Successfully");
		  
	}
} 

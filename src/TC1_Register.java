
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

class TC1_Register {

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
		driver.get("http://localhost/alumni_pro2/");
	    driver.manage().window().setSize(new Dimension(1018, 824));
	    driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select")).click();
	    {
	        WebElement dropdown = driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select"));
	        dropdown.findElement(By.xpath("//option[. = 'นางสาว']")).click();
	      }
	    driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select")).click();
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("name")).sendKeys("ณัฎฐณิชา ");
	    driver.findElement(By.id("lastname")).click();
	    driver.findElement(By.id("lastname")).sendKeys("ปั้นเปี่บมทอง");	   
	    driver.findElement(By.id("gender")).click();
	    {
	        WebElement dropdown = driver.findElement(By.id("gender"));
	        dropdown.findElement(By.xpath("//option[. = 'หญิง']")).click();
	      }
	    driver.findElement(By.id("p_num")).click();
	    driver.findElement(By.id("p_num")).sendKeys("1700401319981");
	    driver.findElement(By.id("date")).click();
	    driver.findElement(By.id("date")).sendKeys("2021-01-31");
	    driver.findElement(By.id("s_pe")).click();
	    driver.findElement(By.id("s_pe")).sendKeys("2565");
	    driver.findElement(By.id("session")).click();
	    driver.findElement(By.id("session")).sendKeys("61/47");
	    driver.findElement(By.id("stu_id")).click();
	    driver.findElement(By.id("stu_id")).sendKeys("614259012");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.id("h_number")).click();
	    driver.findElement(By.id("h_number")).sendKeys("136");
	    driver.findElement(By.id("swine")).click();
	    driver.findElement(By.id("swine")).sendKeys("1");
	    driver.findElement(By.id("h_dis")).click();
	    driver.findElement(By.id("h_dis")).sendKeys("ห้วยม่วง");
	    driver.findElement(By.id("h_per")).click();
	    driver.findElement(By.id("h_per")).sendKeys("กำแพงแสน");
	    driver.findElement(By.id("hpro")).click();
	    driver.findElement(By.id("hpro")).sendKeys("นครปฐม");
	    driver.findElement(By.id("h_code")).click();
	    driver.findElement(By.id("h_code")).sendKeys("73180");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("nattacah.pantoey@gmail.com");
	    driver.findElement(By.cssSelector(".modal-body:nth-child(9) > .form-row:nth-child(1) > .col:nth-child(2)")).click();
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).sendKeys("0984378180");
	    driver.findElement(By.id("facebook")).click();
	    driver.findElement(By.id("facebook")).sendKeys("https://www.facebook.com/toey.love.ve/");
	    driver.findElement(By.id("line")).click();
	    driver.findElement(By.id("line")).sendKeys("toey1405");
	    driver.findElement(By.id("w_ps")).click();
	    driver.findElement(By.id("w_ps")).sendKeys("ว่าง");
	    driver.findElement(By.id("w_name")).click();
	    driver.findElement(By.id("w_name")).sendKeys("ว่าง");
	    driver.findElement(By.id("w_code")).click();
	    driver.findElement(By.id("w_code")).sendKeys("-");
	    driver.findElement(By.id("w_mu")).click();
	    driver.findElement(By.id("w_mu")).sendKeys("-");
	    driver.findElement(By.id("w_tum")).click();
	    driver.findElement(By.id("w_tum")).sendKeys("-");
	    driver.findElement(By.id("w_per")).click();
	    driver.findElement(By.id("w_per")).sendKeys("-");
	    driver.findElement(By.id("w_por")).click();
	    driver.findElement(By.id("w_por")).sendKeys("-");
	    driver.findElement(By.id("w_pai")).click();
	    driver.findElement(By.id("w_pai")).sendKeys("-");
	   
	    driver.findElement(By.cssSelector(".btn")).click();
	    driver.findElement(By.cssSelector("html")).click();
	    String result = driver.findElement(By.id("ok")).getText();
	        Thread.sleep(4000);
	        driver.close();
	        assertEquals("คุณลงทะเบียนเสร็จเรียบร้อยแล้ว",result);
	        System.out.print("Regis Successfully");
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
		    driver.manage().window().setSize(new Dimension(1018, 824));
		    driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select")).click();
		    {
		        WebElement dropdown = driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select"));
		        dropdown.findElement(By.xpath("//option[. = 'นาย']")).click();
		      }
		    driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select")).click();
		    driver.findElement(By.id("name")).click();
		    driver.findElement(By.id("name")).sendKeys("ธันวา");
		    driver.findElement(By.id("lastname")).click();
		    driver.findElement(By.id("lastname")).sendKeys("กุนทะมุณี");
		    driver.findElement(By.id("gender")).click();
		    {
		        WebElement dropdown = driver.findElement(By.id("gender"));
		        dropdown.findElement(By.xpath("//option[. = 'ชาย']")).click();
		      }
		    driver.findElement(By.id("p_num")).click();
		    driver.findElement(By.id("p_num")).sendKeys("12345678945612");
		    driver.findElement(By.id("date")).click();
		    driver.findElement(By.id("date")).sendKeys("2021-01-31");
		    driver.findElement(By.id("s_pe")).click();
		    driver.findElement(By.id("s_pe")).sendKeys("2564");
		    driver.findElement(By.id("session")).click();
		    driver.findElement(By.id("session")).sendKeys("61/99");
		    driver.findElement(By.id("stu_id")).click();
		    driver.findElement(By.id("stu_id")).sendKeys("614259037");
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).sendKeys("123456");
		    driver.findElement(By.id("h_number")).click();
		    driver.findElement(By.id("h_number")).sendKeys("88");
		    driver.findElement(By.id("swine")).click();
		    driver.findElement(By.id("swine")).sendKeys("2");
		    driver.findElement(By.id("h_dis")).click();
		    driver.findElement(By.id("h_dis")).sendKeys("ห้วยม่วง");
		    driver.findElement(By.id("h_per")).click();
		    driver.findElement(By.id("h_per")).sendKeys("กำแพงแสน");
		    driver.findElement(By.id("hpro")).click();
		    driver.findElement(By.id("hpro")).sendKeys("นครปฐม");
		    driver.findElement(By.id("h_code")).click();
		    driver.findElement(By.id("h_code")).sendKeys("73180");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("tunva@gmail.com");
		    driver.findElement(By.cssSelector(".modal-body:nth-child(9) > .form-row:nth-child(1) > .col:nth-child(2)")).click();
		    driver.findElement(By.id("phone")).click();
		    driver.findElement(By.id("phone")).sendKeys("0878895641");
		    driver.findElement(By.id("facebook")).click();
		    driver.findElement(By.id("facebook")).sendKeys("tanva");
		    driver.findElement(By.id("line")).click();
		    driver.findElement(By.id("line")).sendKeys("jam05");
		    driver.findElement(By.id("w_ps")).click();
		    driver.findElement(By.id("w_ps")).sendKeys("ว่าง");
		    driver.findElement(By.id("w_name")).click();
		    driver.findElement(By.id("w_name")).sendKeys("ว่าง");
		    driver.findElement(By.id("w_code")).click();
		    driver.findElement(By.id("w_code")).sendKeys("-");
		    driver.findElement(By.id("w_mu")).click();
		    driver.findElement(By.id("w_mu")).sendKeys("-");
		    driver.findElement(By.id("w_tum")).click();
		    driver.findElement(By.id("w_tum")).sendKeys("-");
		    driver.findElement(By.id("w_per")).click();
		    driver.findElement(By.id("w_per")).sendKeys("-");
		    driver.findElement(By.id("w_por")).click();
		    driver.findElement(By.id("w_por")).sendKeys("-");
		    driver.findElement(By.id("w_pai")).click();
		    driver.findElement(By.id("w_pai")).sendKeys("-");
		   
		    driver.findElement(By.cssSelector(".btn")).click();
		    driver.findElement(By.cssSelector("html")).click();
		    
		    String result = driver.findElement(By.id("ok")).getText();
	        Thread.sleep(4000);
	        driver.close();
	        assertEquals("คุณลงทะเบียนเสร็จเรียบร้อยแล้ว",result);
	        System.out.print("Regis Successfully");
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
		 driver.get("http://localhost/alumni_pro2/");
		    driver.manage().window().setSize(new Dimension(1018, 824));
		    driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select")).click();
		    {
		        WebElement dropdown = driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select"));
		        dropdown.findElement(By.xpath("//option[. = 'นางสาว']")).click();
		      }
		    driver.findElement(By.cssSelector(".form-row:nth-child(1) .custom-select")).click();
		    driver.findElement(By.id("name")).click();
		    driver.findElement(By.id("name")).sendKeys("ณัฎฐณิชา ");
		    driver.findElement(By.id("lastname")).click();
		    driver.findElement(By.id("lastname")).sendKeys("ปั้นเปี่บมทอง");
		    driver.findElement(By.id("gender")).click();
		   
		    driver.findElement(By.id("gender")).click();
		    driver.findElement(By.id("p_num")).click();
		    driver.findElement(By.id("p_num")).sendKeys("");
		    driver.findElement(By.id("date")).click();
		    driver.findElement(By.id("date")).sendKeys("2021-01-31");
		    driver.findElement(By.id("s_pe")).click();
		    driver.findElement(By.id("s_pe")).sendKeys("2565");
		    driver.findElement(By.id("session")).click();
		    driver.findElement(By.id("session")).sendKeys("61/47");
		
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).sendKeys("123456");
		    driver.findElement(By.id("h_number")).click();
		    driver.findElement(By.id("h_number")).sendKeys("136");
		    driver.findElement(By.id("swine")).click();
		    driver.findElement(By.id("swine")).sendKeys("1");
		    driver.findElement(By.id("h_dis")).click();
		    driver.findElement(By.id("h_dis")).sendKeys("ห้วยม่วง");
		    driver.findElement(By.id("h_per")).click();
		    driver.findElement(By.id("h_per")).sendKeys("กำแพงแสน");
		    driver.findElement(By.id("hpro")).click();
		    driver.findElement(By.id("hpro")).sendKeys("นครปฐม");
		    driver.findElement(By.id("h_code")).click();
		    driver.findElement(By.id("h_code")).sendKeys("73180");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("nattacah.pantoey@gmail.com");
		    driver.findElement(By.cssSelector(".modal-body:nth-child(9) > .form-row:nth-child(1) > .col:nth-child(2)")).click();
		    driver.findElement(By.id("phone")).click();
		    driver.findElement(By.id("phone")).sendKeys("0984378180");
		    driver.findElement(By.id("facebook")).click();
		    driver.findElement(By.id("facebook")).sendKeys("https://www.facebook.com/toey.love.ve/");
		    driver.findElement(By.id("line")).click();
		    driver.findElement(By.id("line")).sendKeys("toey1405");
		    driver.findElement(By.id("w_ps")).click();
		    driver.findElement(By.id("w_ps")).sendKeys("ว่าง");
		    driver.findElement(By.id("w_name")).click();
		    driver.findElement(By.id("w_name")).sendKeys("ว่าง");
		    driver.findElement(By.id("w_code")).click();
		    driver.findElement(By.id("w_code")).sendKeys("-");
		    driver.findElement(By.id("w_mu")).click();
		    driver.findElement(By.id("w_mu")).sendKeys("-");
		    driver.findElement(By.id("w_tum")).click();
		    driver.findElement(By.id("w_tum")).sendKeys("-");
		    driver.findElement(By.id("w_per")).click();
		    driver.findElement(By.id("w_per")).sendKeys("-");
		    driver.findElement(By.id("w_por")).click();
		    driver.findElement(By.id("w_por")).sendKeys("-");
		    driver.findElement(By.id("w_pai")).click();
		    driver.findElement(By.id("w_pai")).sendKeys("-");

		    driver.findElement(By.cssSelector(".btn")).click();
		    driver.findElement(By.cssSelector("html")).click();
		    String result = driver.findElement(By.id("register")).getText();
	        Thread.sleep(4000);
	        driver.close();
	        assertEquals("ลงทะเบียน",result);
	       
	}

}




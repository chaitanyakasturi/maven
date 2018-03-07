package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionCheck {
  @Test
  public void f() {
	  System.setProperty("webriver.chrome.driver", "C:\\Users\\Kasturi\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://gmail.com/");
	  driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("lkjkj;lkaja");
	  driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	  WebElement actual_res=driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]"));
	  
	  String expected_res="Enter a valid email or phone number";
/*	  Assert.assertEquals(actual_res, expected_res);
	  System.out.println("Test Passed");*/
	  Assert.assertTrue(false, expected_res);
	  
  }
}

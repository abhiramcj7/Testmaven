package Testmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Charge {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@Test
	public void url()  {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://charge.vizru.com/user.signin");
		driver.findElement(By.xpath("//*[@placeholder=\"Email ID\"]")).sendKeys("abhiramc@vizru.com");
		driver.findElement(By.xpath("//*[@placeholder=\"Password\"]")).sendKeys("Abhiram@2001");
		driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[3]/div/input")).click();
		//driver.findElement(By.xpath("/html/body/div[5]/header/div[4]/ul/li[2]/a/i")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='AppTest']"))).click();
	    //driver.findElement(By.xpath("//span[@title='AppTest'")).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='app test']"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add']"))).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[3]/div/article/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div/input"))).sendKeys("7");
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[3]/div/article/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div/input"))).sendKeys("Anas");
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[3]/div/article/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div[3]/div/div/input"))).sendKeys("anas@vizru.com");
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[3]/div/article/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div[5]/div/div/input"))).sendKeys("2500");
	
     /* WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[3]/div/article/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div[4]/div/div/span/span[1]/span/span[1]")));
      Select s1=new Select(e1);
      s1.deselectByVisibleText("male");*/
	  driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[3]/div/article/div[2]/div/div/div/form/div[1]/div[2]/div[3]/div/div[4]/div/div/select/option[2]")).click();
      driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/div[3]/div/article/div[2]/div/div/div/form/div[2]/div/div/button[1]")).click();
     
	}
}


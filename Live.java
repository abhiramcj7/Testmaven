package Testmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Live {
	 ChromeDriver driver;
	 
	 @BeforeTest
	 public void setup() {
		 driver=new ChromeDriver();
		 
	 }
	 @Test
	 public void url() throws InterruptedException  {
		 driver.get("https://octquickrlce.vizru.com/#workflow.html");
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[1]/div/input")).sendKeys("abhiramc@vizru.com");
		 driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[2]/div/input")).sendKeys("Abhiram@2001");
		 driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[3]/div/input")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div/div[2]/section[1]/ul/li[1]/span/a"))).click();
		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div/div[2]/section[1]/ul/li[1]/span/a"))).click();
		 Thread.sleep(5000);
		
		 
	 }
}

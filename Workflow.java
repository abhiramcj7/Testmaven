package Testmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workflow {
	ChromeDriver driver;
	
	@BeforeTest
	public void  setup() {
		driver=new ChromeDriver();
	}
	@Test
	public void url() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://charge.vizru.com/#workflow.html");
		driver.findElement(By.xpath("//*[@placeholder=\"Email ID\"]")).sendKeys("abhiramc@vizru.com");
		driver.findElement(By.xpath("//*[@placeholder=\"Password\"]")).sendKeys("Abhiram@2001");
		driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[3]/div/input")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div/div[2]/section[1]/ul/li[1]/span/a"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[2]/div/div[1]/form/div/div[2]/a"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/div[1]/form/div/div[2]/a")).click();
				
	}
	@AfterTest
	public void end() {
		driver.quit();
	}
	
}

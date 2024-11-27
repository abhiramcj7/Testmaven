package Testmaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@Test
	public void url() throws InterruptedException{
		driver.get("https://octquickrlce.vizru.com/#workflow.html");
		driver.manage().window().maximize();
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[1]/div/input")).sendKeys("devika@vizru.com");
		driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[2]/div/input")).sendKeys("Devika@2000");
		driver.findElement(By.xpath("/html/body/section/div[5]/div[2]/div[1]/form/div[3]/div/input")).click();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]/div/div[1]/div/div[2]/section[1]/ul/li[1]/span/a"))).click();
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wrkflwfrm\"]/div/div[2]/a"))).click();
		Thread.sleep(3000);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[2]/div/div[1]/form/div/div[2]/div[2]/a[2]"))).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/div/div[1]/div/div[2]/span/i")).click();
	
		;
	}
}

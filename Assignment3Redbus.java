package week2.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;


public class Assignment3Redbus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai (All Locations)",Keys.BACK_SPACE);
		//driver.findElement(By.xpath("//input[@id='src']")).click();
		driver.findElement(By.xpath("(//ul[@class='autoFill'])[1]/li")).click();
		//driver.findElement(By.xpath("//ul[@class='autoFill']/li)[1]")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bengaluru", Keys.BACK_SPACE);
		//driver.findElement(By.xpath("//input[@id='src']")).click();
		driver.findElement(By.xpath("(//ul[@class='autoFill'])[1]/li")).click();
				
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("search_btn")).click();
		
		Thread.sleep(3000);
		String searchresult1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned : "+searchresult1);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		
		
		WebElement BusType = driver.findElement(By.xpath("//label[@for='dtBefore 6 am'][1]"));
		//to perform Scroll on application using Selenium
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", BusType);
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		Thread.sleep(1000);
		String searchresult2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned for Sleeper : "+searchresult2);
		
		//bt_AC
		js.executeScript("arguments[0].scrollIntoView();", BusType);
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		driver.findElement(By.xpath("(//label[@for='bt_AC'])[1]")).click();
		Thread.sleep(1000);
		String searchresult3 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned for AC : "+searchresult3);
		
		//bt_NONAC
		js.executeScript("arguments[0].scrollIntoView();", BusType);
		driver.findElement(By.xpath("(//label[@for='bt_AC'])[1]")).click();
		driver.findElement(By.xpath("(//label[@for='bt_NONAC'])[1]")).click();
		Thread.sleep(1000);
		String searchresult4 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned for NONAC : "+searchresult4);
		
		driver.close();
	}

}

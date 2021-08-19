package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

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
		
		//driver.findElement(By.xpath("//ul[@class='autoFill']/li)[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		//driver.findElement(By.xpath("//td[@class='current day']")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		driver.findElement(By.id("search_btn")).click();
		
		//System.out.println(driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='close']/i")).click();
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		
		//driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).isDisplayed()
		//if(driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).isDisplayed())
			//driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='close']/i")).click();
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		
		//driver.findElement(By.xpath("//i[@class='icon icon-close']")).isDisplayed();
		//if(driver.findElement(By.xpath("//i[@class='icon icon-close']")).isDisplayed())
			//driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		
		
		//driver.manage().window().fullscreen();
		String searchresult1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned : "+searchresult1);
		
		driver.findElement(By.xpath("//input[@id='bt_SLEEPER']")).click();
		String searchresult2 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned : "+searchresult2);
		
		//bt_AC
		driver.findElement(By.xpath("//input[@id='bt_AC']")).click();
		String searchresult3 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned : "+searchresult3);
		
		//bt_NONAC
		driver.findElement(By.xpath("//input[@id='bt_NONAC']")).click();
		String searchresult4 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No. of buses returned : "+searchresult4);
		
		//driver.close();
	}

}

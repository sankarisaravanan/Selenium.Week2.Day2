package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment1Activity1Drodown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select dropindex = new Select(drop1);
		dropindex.selectByIndex(2);
		
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select droptext = new Select(drop2);
		droptext.selectByVisibleText("UFT/QTP");
		
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select dropvalue = new Select(drop3);
		dropvalue.selectByValue("1");
		
		WebElement drop4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select dropoptions = new Select(drop4);
		System.out.println("No. of Options in the drop down : " + dropoptions.getOptions().size());
		
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("A",Keys.ENTER,Keys.TAB);
		
	}
}

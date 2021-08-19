package week2.Day2;

import java.awt.Checkbox;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Activity7Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.findElement(By.xpath("(//input)[1]")).click();
		//System.out.println(driver.findElement(By.xpath("(//input)[1]")).getAttribute("id"));
		System.out.println(driver.findElementsByTagName("input").size());
		
		if(driver.findElement(By.xpath("(//input)[6]")).isSelected())
			System.out.println("Option Selenium is Checked");
		else {
			driver.findElement(By.xpath("(//input)[6]")).click();
			System.out.println("Option Selenium is Checked");
		}
			for(int i=7;i<=8;i++) {
			if(driver.findElement(By.xpath("(//input)["+i+"]")).isSelected())
				driver.findElement(By.xpath("(//input)["+i+"]")).click();
		}
		List<WebElement> checkboxes = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));
		for(int j=0;j<checkboxes.size();j++) {
			Thread.sleep(1000);
			checkboxes.get(j).click();
		}
		
		/* Another Method
		 for(int i=9;i<=13;i++) {
			if(! driver.findElement(By.xpath("(//input)["+i+"]")).isSelected())
				driver.findElement(By.xpath("(//input)["+i+"]")).click();
		}*/
		driver.close();		
	}

}

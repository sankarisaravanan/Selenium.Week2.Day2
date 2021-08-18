package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Activity1Radio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.id("yes")).click();
		
		WebElement check1 = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
		WebElement uncheck1 = driver.findElement(By.xpath("(//input[@value='0'])[2]"));
		
		if(check1.isSelected())
			System.out.println("Default Selected Option is : Checked");
		else if(uncheck1.isSelected())
			System.out.println("Default Selected Option is : UnChecked");
		////label[@for='Checked']

		driver.findElement(By.xpath("(//input[@value='1'])[3]")).click();
		//driver.findElement(By.xpath("//input[@value='2']")).click();

	}

}

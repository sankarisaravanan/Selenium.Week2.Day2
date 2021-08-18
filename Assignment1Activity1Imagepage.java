package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment1Activity1Imagepage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		//xpath -> //label[text()='Click on this image to go home page']/following-sibling::img
		
		//homepage Title = TestLeaf - Selenium Playground
		
		String brokeimgwidth = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("naturalWidth");
		if (brokeimgwidth.equals("0"))
			System.out.println("It is a broken Image");
		else
			System.out.println("Image is not broken");
		//xpath -> //label[text()='Am I Broken Image?']/following-sibling::img
		
		driver.findElement(By.xpath("//label[contains(text(),'using Keyboard')]/following-sibling::img")).click();
		
		driver.navigate().back();
		
		// xpath -> //label[contains(text(),'using Keyboard')]/following-sibling::img
	}

}

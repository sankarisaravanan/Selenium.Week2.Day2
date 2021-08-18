package week2.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Assignment1Activity1Editpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("sankarisaravanan@gmail.com");
		WebElement appendTxtbox = driver.findElement(By.xpath("//input[@value='Append ']"));
		String appendTxt = appendTxtbox.getAttribute("value");
		System.out.println(appendTxt);
		appendTxtbox.sendKeys("Hello");
		appendTxtbox.sendKeys(Keys.TAB);
		System.out.println("Default text displayed :" +driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		//appendTxtbox.sendKeys(Keys.TAB, Keys.ENTER); 
		//System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).getAttribute("disabled"));
		String disableTxt = driver.findElement(By.xpath("(//input[@type='text'])[5]")).getAttribute("disabled");
		if(disableTxt.equals("true")) {
		System.out.println("Text field \""+driver.findElement(By.xpath("//label[contains(text(),'Confirm')]")).getText()+"\" is disabled");
		}
		
		WebElement disablefield = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		if(disablefield.isEnabled()) 
			System.out.println("Text field \""+driver.findElement(By.xpath("//label[contains(text(),'Confirm')]")).getText()+"\" is Enabled");
		else
			System.out.println("Text field \""+driver.findElement(By.xpath("//label[contains(text(),'Confirm')]")).getText()+"\" is disabled");
			
		driver.close();
	}

}

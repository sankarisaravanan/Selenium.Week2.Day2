package week2.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class Assignment1Activity1Buttonpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		String homeTitle = driver.getTitle();
		System.out.println(homeTitle); //title = TestLeaf - Selenium Playground
		
		driver.navigate().back();
		String buttonTitle = driver.getTitle();
		System.out.println(buttonTitle); //title = TestLeaf - Selenium Playground
		
		System.out.println("Position of Get Position button is : " +driver.findElement(By.id("position")).getLocation());
		
		//System.out.println("Colour of the button : "+ driver.findElement(By.id("color")).getAttribute("Style"));
		String buttonColor = driver.findElement(By.id("color")).getAttribute("Style");
		buttonColor = buttonColor.replaceAll("background-color:", "");
		System.out.println("Colour of the button : "+buttonColor);
		
		System.out.println("Size of the button : " +driver.findElement(By.id("size")).getSize());
		driver.close();
		
	}

}

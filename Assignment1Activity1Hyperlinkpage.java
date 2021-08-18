package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Activity1Hyperlinkpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println("Hyperlink Page Title : "+ driver.getTitle());
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println("Home Page Title : "+ driver.getTitle());
		
		driver.findElement(By.xpath("//h5[text()='Button'] / parent::a")).click();
		driver.navigate().back();
		driver.navigate().back();
		String Title1 = driver.getTitle();
		System.out.println("Web page title After back navigation : " + Title1);
		
		if(Title1.equals("TestLeaf - Interact with HyperLinks")) {
			driver.findElement(By.linkText("Verify am I broken?")).click();
			String Title2 = driver.findElement(By.xpath("//h1")).getText();
			System.out.println("Broken Page Title : "+Title2);
			if(Title2.contains("Staus 404"))
				System.out.println("I am a Broken Page");
			else
				System.out.println("I am not Broken");
		}	
		else
			driver.close();
		////h5[text()='Button'] / parent::a
		driver.navigate().back();
		WebElement homepage = driver.findElement(By.xpath("//label[contains(text(),'same link')]/preceding-sibling::a"));
		if (homepage.getText().equals("Go to Home Page")) {
			System.out.println("Interacted with same link name");
			homepage.click();
			driver.navigate().back();
		}
		else
			System.out.println("Interacted with different link");
	
	
	System.out.println("No. of Hyperlinks : " + driver.findElements(By.tagName("a")).size());
		
	}
	
}

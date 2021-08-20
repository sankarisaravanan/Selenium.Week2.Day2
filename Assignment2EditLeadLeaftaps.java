package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditLeadLeaftaps {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.get("https://google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String toupdatename = "TestLeaf-Editupdate";
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			
		//WebElement findElement = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Raja");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String ID= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(toupdatename);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		String updatedText = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		toupdatename=toupdatename+" ("+ID+")";
		
		System.out.println("Company name to Update: " + toupdatename);
		System.out.println("Updated Company name : " + updatedText);
		
		//To check whether updated text contains becoz after updation ID also get appeneded by application code
		if(updatedText.contains(toupdatename))
			System.out.println("Company name updated sucessfully");
		else
			System.out.println("Company name updation is unsucessful");
				
		//to check exact updated value
		if(updatedText.equals(toupdatename))
			System.out.println("Company name updated sucessfully");
		else
			System.out.println("Company name updation is unsucessful");
		driver.close();
		
		}
	}

}

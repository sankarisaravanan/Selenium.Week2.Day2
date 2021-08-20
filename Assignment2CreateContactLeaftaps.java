package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2CreateContactLeaftaps {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.get("https://google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Test");
		driver.findElement(By.id("lastNameField")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("LocalTest");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LocalLeaf");
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("Tester");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("08/20/2021");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("QA Manager");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("TCOE");
		
		//dropdown
		driver.findElement(By.id("createContactForm_preferredCurrencyUomId")).sendKeys("Indian Rupee");
		
		driver.findElement(By.id("createContactForm_accountPartyId")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Contact created for Testing purpose");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("TestOnly");
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("117");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("9962089188");
		driver.findElement(By.id("createContactForm_primaryPhoneExtension")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_primaryPhoneAskForName")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Leaf1@gmail.com");
		driver.findElement(By.id("generalToNameField")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_generalAttnName")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_generalAddress2")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Leaf1");
		
		//dropdown
		driver.findElement(By.id("createContactForm_generalPostalCode")).sendKeys("India");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		
		//dropdown
		driver.findElement(By.id("createContactForm_generalCountryGeoId")).sendKeys("Leaf1");
		driver.findElement(By.id("createContactForm_generalPostalCodeExt")).sendKeys("Leaf1");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(1000);
		String str1 = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("Contact created successfully with ID : "+str1);
		
				
		}

	}

}

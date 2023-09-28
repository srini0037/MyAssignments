package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize browser and launch URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Login into Application
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Enter into the application
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		//Fill Create Account Form
		String accName = "SrinivasTestOne";
		driver.findElement(By.id("accountName")).sendKeys(accName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		industry.selectByValue("IND_SOFTWARE");
		Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownership.selectByVisibleText("S-Corporation");
		Select source = new Select(driver.findElement(By.name("dataSourceId")));
		source.selectByValue("LEAD_EMPLOYEE");
		Select campaign = new Select(driver.findElement(By.id("marketingCampaignId")));
		campaign.selectByIndex(5);
		Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		state.selectByValue("TX");
		
		//Submit the page
		driver.findElement(By.className("smallSubmit")).click();
		
		//Validate if the Account name is correct
		String accNameVerify = "//*[contains(text(),'"+accName+"')]";
		String valid = driver.findElement(By.xpath(accNameVerify)).getText();
		System.out.println(valid);
		if(valid.contains(accName))
			System.out.println("Account name is correct");
		
		driver.close();
		
		
		
		
		
		
		
	}

}

package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//click create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter form
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Pavi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pavi@gmail.com");
		WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(findElement);
		dd.selectByVisibleText("New York");
		WebElement leadSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select src=new Select(leadSource);
		src.selectByValue("LEAD_CONFERENCE");
		
		driver.findElement(By.name("submitButton")).click();
		
		
		System.out.println("Title of the web page is : "+driver.getTitle());
		
		//click duplicate
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//clear Company name and enter new name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestGround");
		
		//clear name and enter new name
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PavithraHari");
		
		//click create
		driver.findElement(By.className("smallSubmit")).click();
		
		//display title
		System.out.println("Resulting page's title is : "+driver.getTitle());


	}

}

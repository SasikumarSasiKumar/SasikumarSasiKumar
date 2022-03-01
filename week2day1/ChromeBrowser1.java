package week.week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		String text =driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();// near CRM/SFA <A> use linktext
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();  // "create lead"  insted of "create" it will take
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SASI KUMAR");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title= driver.getTitle();
	    String title2="view lead|opentaps CMR";
	    if(title.equals(title2))
	    {
	    	System.out.println("test case pass");
	    }
	    else
	    {
	    	System.out.println("test case fail");
	    }
		driver.close();
		
		
	}

}

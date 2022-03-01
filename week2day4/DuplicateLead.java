package week.week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("sasikumarnamani@gmail.com");
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButton']")).click();
		String title=driver.getTitle();
		String title1 ="Duplicate Lead | opentaps CRM";
		System.out.println(title1);
		driver.findElement(By.className("smallSubmit")).click();
		String name = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(name);
		driver.close();
		}

}

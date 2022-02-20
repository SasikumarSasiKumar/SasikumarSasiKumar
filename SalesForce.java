package ClassRoom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Sasi kumar");
		driver.findElement(By.name("UserLastName")).sendKeys("N");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("sasikumarnamani@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("91 9443322650");
		
		WebElement dropdown = driver.findElement(By.name("UserTitle"));
		Select value = new Select(dropdown);
		value.selectByValue("Sales_Manager_AP");
		
		//driver.findElement(By.xpath("//select[@name='CompanyEmployees']/option[@value='75']")).click();
		
		WebElement dropdown1 = driver.findElement(By.name("CompanyEmployees"));
		Select value1 = new Select(dropdown1);
		value1.selectByValue("250");
		
		//driver.findElement(By.xpath("//select[@name='CompanyCountry']/option[@value='US']")).click();
		
		WebElement dropdown2 = driver.findElement(By.name("CompanyCountry"));
		Select value2 = new Select(dropdown2);
		value2.selectByValue("IN");
		
		//driver.findElement(By.xpath("//div[@class='field']//input[@name='SubscriptionAgreement']")).click();
		driver.findElement(By.className("checkbox-ui")).click();
		
		driver.close();
		
		
		
		
		
	}

}

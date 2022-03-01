package week.week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("SASI KUMAR");
		driver.findElement(By.id("lastNameField")).sendKeys("N");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("MANI");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.name("description")).sendKeys("NOTHING TO SAY");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sasikumarnamani@gmail.com");
		WebElement dropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select newyork = new Select(dropdown);
		newyork.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("java is not fun");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		String title2 = "View Contact | opentaps CRM";
		if (title.equals(title2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}

}

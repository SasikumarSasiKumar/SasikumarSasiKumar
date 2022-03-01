package week.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input[@data-type='text']")).sendKeys("SASI KUMAR");
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sasikumarnamani@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sasikumarnamani@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Sasikumar");
		
		
		WebElement dropdown = driver.findElement(By.id("day"));
		Select value =new Select(dropdown);
		value.selectByValue("9");
		
		WebElement dropdown1 = driver.findElement(By.id("month"));
		Select text=new Select(dropdown1);
		text.selectByVisibleText("Sep");
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select value1 =new Select(dropdown3);
		value1.selectByValue("1998");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

		
	}
}
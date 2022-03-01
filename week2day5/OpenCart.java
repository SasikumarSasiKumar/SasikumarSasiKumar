package week.week2day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.name("username")).sendKeys("SASI KUMAR SASI KUMAR");
		driver.findElement(By.name("firstname")).sendKeys("sasi kumar 98");
		driver.findElement(By.name("lastname")).sendKeys("N");
		driver.findElement(By.id("input-email")).sendKeys("sasikumarnamani@gmail.com");
		driver.findElement(By.id("input-country")).sendKeys("INDIA");
		driver.findElement(By.name("password")).sendKeys("Sasikumar1998");
		
		driver.findElement(By.xpath("//div[@id='button-register']/button[@type='submit'][1]")).click();
		driver.close();
		
		

	}

}

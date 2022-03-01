package week.week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("sasikumarnamani@gmail.com");
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		ele.clear();
		ele.sendKeys("sasi",Keys.TAB);
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(attribute);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
		}

}


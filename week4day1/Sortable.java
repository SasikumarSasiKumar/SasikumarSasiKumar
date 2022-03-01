package week.week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		Actions builder = new Actions (driver);
		builder.clickAndHold(ele2).moveToElement(ele).click().perform();
		driver.switchTo().defaultContent();

	}

}

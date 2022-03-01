package week.week3day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		       WebDriverManager.chromedriver().setup();
		       ChromeDriver driver=new ChromeDriver();
				driver.get("http://leafground.com/pages/selectable.html");
				driver.manage().window().maximize();
				
				WebElement ele = driver.findElement(By.xpath("//li[text()='Item 1']"));
				WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 5']"));
				WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 3']"));
				Actions builder= new Actions (driver);
				
				// select particular item
				builder.keyDown(Keys.CONTROL).click(ele).click(ele1).click(ele2).release().perform();
				
				
				
				
				// select all item
	
				//builder.clickAndHold(ele).moveToElement(ele1).release().perform();
				
				
				

	}

}

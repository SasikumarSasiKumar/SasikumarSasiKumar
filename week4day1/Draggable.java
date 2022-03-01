package week.week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/draggable/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.switchTo().frame(0);
		 WebElement drag = driver.findElement(By.id("draggable"));
		 Actions build = new Actions(driver);
		 
		 build.dragAndDropBy(drag, 50, 50).build().perform();
		 driver.switchTo().defaultContent();
		 
		 
		 

	}

}

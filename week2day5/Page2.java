package week.week2day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page2 {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://leafground.com/pages/Link.html");
	 
	 driver.findElement(By.linkText("Go to Home Page")).click();
	 driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();
	 driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
	 driver.findElement(By.id("home")).click();
	 String title = driver.getTitle();
	 String text ="TestLeaf - Interact with HyperLinks";
	 if(title.equals(text)) {
		 System.out.println("title is correct");
		 
	 }
	 else {
		 System.out.println("title is wrong");
	 }
	 
	 
	
	}

}

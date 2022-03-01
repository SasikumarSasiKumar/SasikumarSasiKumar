package week.week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTabs {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//label[@for='username']/ancestor::form")); //grand child...... grandparent
		//driver.findElement(By.xpath("//label[@for='username']/following-sibling::input")).sendKeys("demosalesmanager");
		//eleder sibling following   younger sibling 
		//driver.findElement(By.xpath("(//input[@class='inputLogin']/preceding-sibling::label)[1]")).sendKeys("sasi kumar");
		
		
	}

}

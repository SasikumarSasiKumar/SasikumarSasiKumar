package week.week3day4;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(Option);
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement men = driver.findElement(By.linkText("Men's Fashion"));
		Actions builder = new Actions (driver);
		builder.moveToElement(men).build().perform();
		
		WebElement shoes=driver.findElement(By.linkText("Sports Shoes"));
		
		Actions builders=new Actions(driver);
		builders.click(shoes).build().perform();
		
		//List <WebElement> shoesCount=driver.findElements(By.linkText("//div[@class='child-cat-name selected']/following-sibling::div"));
		//int size=shoesCount.size();
		//System.out.println("Count of Sports Shoes For men's: "+ size);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		

	}

}

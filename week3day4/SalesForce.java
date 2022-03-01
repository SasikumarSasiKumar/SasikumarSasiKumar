package week.week3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(Option);
		
		driver.get(" https://www.ajio.com/shop/sale?utm_source=xyzdeals&utm_medium=affiliate_1491&clickID=44623008");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

         Actions builder=new Actions(driver);
         WebElement men   = driver.findElement(By.linkText("MEN"));
         builder.moveToElement(men).perform();
         
         driver.findElement(By.xpath("//a[text()='Shirts'][1]")).click();
		
		
		
}

}

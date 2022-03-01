package week.week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromebrowser2 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    WebElement DropDown1 = driver.findElement(By.id("dropdown1"));
		Select index=new Select(DropDown1);
		index.selectByIndex(2);
		
		WebElement  dropdown2= driver.findElement(By.name("dropdown2"));
		Select text =new Select(dropdown2);
		text.selectByVisibleText("UFT/QTP");
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select value=new Select(dropdown3);
		value.selectByValue("4");
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select value1 = new Select(dropdown);
		value1.selectByValue("4");
		
		
		   
		
		
		
	
		
	}

}

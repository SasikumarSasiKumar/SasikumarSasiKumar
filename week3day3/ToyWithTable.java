package week.week3day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyWithTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> coloum = driver.findElements(By.tagName("th"));
		int coloumsize = coloum.size();  // coloum.size   -----ctrl+2,l
		System.out.println("coloum size"+ coloumsize);
		
		List<WebElement> row = driver.findElements(By.tagName("td"));
		int rowsize2 = row.size();
		System.out.println("row size"+ rowsize2);
		
		String processValue = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td")).getText();
		
		System.out.println("processValue :"+ processValue);
		
		
		List<Integer> value=new ArrayList<Integer>();
		
		for(int i=2; i<rowsize2; i++) {
			String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]//td[2]")).getText();
			System.out.println(text);
			
			 String ReplaceAll= text.replaceAll("%", "");
			// System.out.println(ReplaceAll);
			 
			 int parseInt = Integer.parseInt(ReplaceAll);
			 //System.out.println(parseInt);
			 
			value.add( parseInt);
			
		}
		System.out.println(value);
		Integer min = Collections.min(value);
		System.out.println("minimum:"+ min);
		
		//driver.findElement(By.xpath().click();
		
          
          
          
          
          
         
          
          
          
	}

}

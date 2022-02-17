package ClassRoom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFile {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("sasikumarnamani@gmail.com");
		WebElement Element = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[2]"));
		Element.clear();
		Element.sendKeys("SASI",Keys.TAB);
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(attribute);
		Boolean clearBox = driver.findElement(By.xpath("//input[@value='Clear me!!']")).isEnabled();
		
		
		

	}

}

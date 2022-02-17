package ClassRoom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		
		String title=driver.getTitle();                                         
		String  text ="TestLeaf - Selenium Playground";//ctrl+f  //title
		
		
		if(title.equals(text)) {
			System.out.println("home page is display");
		}
		else {

		}
		driver.findElement(By.linkText("Button")).click();
	    Point location = driver.findElement(By.id("position")).getLocation();
	    
	    int x=location.getX();
	    System.out.println(x);
	    
		int y=location.getY();
		System.out.println(y);
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(cssValue);
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		
		int hight=size.getHeight();
		System.out.println(hight);
		
		int with=size.getWidth();
		System.out.println(with);
		driver.close();
		
				
		
		
		


	}

}

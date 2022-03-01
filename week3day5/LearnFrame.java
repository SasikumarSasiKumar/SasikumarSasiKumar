package week.week3day5;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		
		WebElement frame = driver.findElement(By.xpath("//button[@id='Click']"));
		frame.click();
		String text = frame.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);            //it has two frame nested frame
		driver.switchTo().frame("frame2");
		
		WebElement frame1 = driver.findElement(By.id("Click1"));
		frame1.click();
		String text2 = frame1.getText();
		System.out.println(text2);
		
	     java.util.List<WebElement> noframe = driver.findElements(By.xpath("//iframe"));
	     int size = noframe.size();
	     System.out.println(size);
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./ Screenshot/leafFrame.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
     
	}

}

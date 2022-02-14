package ClassRoom;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	private static Object object;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=driver.getTitle();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SASI KUMAR");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("00033322211144");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/09/1998");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("B.E EEE");
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("CHENNAI");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1803210");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("NOTHIMG TO SAY");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("JAVA IS NOT FUN");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9443322650");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sasikumarnamani@gmail.com");
	}

}

package locaterConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class variousLocators {
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void learnLocators() {
		
		//locator name
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		
		//locator id
		driver.findElement(By.id("sex-1")).click();
		
		//uploading a file
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\haris\\Desktop\\Who am I.docx");
	
	//locator linkText
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
	//locator partiallinktext
		driver.findElement(By.partialLinkText("TF-API Product")).click();
	
	
		
		//cssSelector
		driver.findElement(By.cssSelector("input#profession-1")).click();
		driver.findElement(By.cssSelector("input[value='5']")).click();
		driver.findElement(By.cssSelector("input[name='exp'][id='exp-3]")).click();
		
		
		//xpath
		//absolute
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[13]/input")).sendKeys("selenium if fun");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xpath is easy");
		//driver.findElement(By.xpath("//input[@name='password' and @))
		
		//xpath with linktext
		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		
	}
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();

	}
	

}

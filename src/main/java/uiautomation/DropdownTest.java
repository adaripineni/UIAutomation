package uiautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {
	
	WebDriver d;

	@BeforeTest
	public void setUp() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		d.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(3000);
	} 
	
	@Test
	public void selectDropdown() throws InterruptedException {
		WebElement dropDown= d.findElement(By.tagName("select"));
		Select menu = new Select(dropDown);
		List<WebElement> options = menu.getOptions();
		menu.selectByIndex(options.size()-1);
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void testDown() {
		d.quit();
	}
	
	
}
	
	
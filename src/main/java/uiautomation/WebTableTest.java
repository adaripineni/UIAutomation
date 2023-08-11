package uiautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTest {
	
	WebDriver d;

	@BeforeTest
	public void setUp() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		// TODO Auto-generated method stub
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		d.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		Thread.sleep(3000);
	} 
	
	@Test
	public void test() throws InterruptedException {
		WebElement w =d.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows =w.findElements(By.tagName("tr"));
		for(WebElement row: rows) {
			List<WebElement> columns_row = row.findElements(By.tagName("td"));
			if(columns_row.size() != 0 && columns_row.get(0).getText().startsWith("A")) {
			System.out.println(columns_row.get(0).getText());

			}
		}

	}
	
	@AfterTest
	public void tearDown() {
		d.quit();
	}

}

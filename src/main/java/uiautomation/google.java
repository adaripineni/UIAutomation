package uiautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
@Test
public void login() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://www.google.com/");
    // identify element
    WebElement p=driver.findElement(By.name("q"));
    p.sendKeys("Selenium Java");
    // Explicit wait condition for search results
    WebDriverWait w = new WebDriverWait(driver, 5);
    w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
    p.submit();
    Thread.sleep(2000);
    
    driver.close();
	}
	
}



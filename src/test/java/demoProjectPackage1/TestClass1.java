package demoProjectPackage1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;
	@BeforeMethod
	public void lunchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Test
	public void test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test1 title is"+ driver.getTitle());

	}
	@Test
	public void test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test2 title is"+ driver.getTitle());
	}
	@Test
	public void test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test3 title is"+ driver.getTitle());

		
	}
	@AfterTest
	public void Quit() {
		if(driver!=null) {
			driver.quit();
		}
		
	}

}

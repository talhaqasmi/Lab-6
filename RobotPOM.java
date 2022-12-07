package robot;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotPOM {
	WebDriver driver;
	New object;
	@BeforeTest
	public void before() {
	driver =new ChromeDriver();
	driver.get("https://www.dev2qa.com/demo/upload/uploadFileTest.html");
	driver.manage().window().maximize();
	PropertyConfigurator.configure("log4j.properties");
	}
	@Test(priority=0)
	public void upload() throws Exception {
		object=new New(driver);
		object.robt();
	}
	@AfterTest
	public void close() throws Exception {
		driver.close();
	}
	

}

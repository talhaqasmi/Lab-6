package robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New {
	WebDriver driver;
	Logger logger=Logger.getLogger("New");
	
	@FindBy(xpath="//*[@name='uploadFileInputBox']")
	WebElement choseFile;
	
	@FindBy(xpath="//*[@name='uploadFileSubmitBtn']")
	WebElement upload;
	
	
New (WebDriver driver){
this.driver = driver;
PageFactory.initElements(driver,this);
}
public void robt() throws Exception {
	Actions drp1=new Actions(driver);
	drp1.click(choseFile).perform();
	logger.info("clicked on choose file");
	Robot robot= new Robot();
	StringSelection Selection=new StringSelection("C:\\Users\\4407\\eclipse-workspace\\autoTest\\src\\test\\java\\autoTest1\\objectFile.java");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
	robot.delay(1000); //Millisecond 1 second delay only if needed
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(1000); //Millisecond 1 second delay only if needed
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	logger.info("file Selected");
	Thread.sleep(3000);
	//file name
	WebElement text2 = choseFile;
	String letters=text2.getAttribute("value");
	Thread.sleep(3000);
	System.out.println("The name of selected file is:" + letters);
	logger.info("file name printed successfully");
	Thread.sleep(3000);
	upload.click();
	logger.info("file uploaded successfully");
}



}

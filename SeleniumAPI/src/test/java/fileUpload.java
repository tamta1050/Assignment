import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
	
	 public static void main(String[] args) throws InterruptedException {
		
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://the-internet.herokuapp.com/upload");
		 
		 Thread.sleep(3000);
		 
		WebElement upload = driver.findElement(By.cssSelector("#file-upload"));
		//upload.click();
		upload.sendKeys("C:\\Users\\tamta\\eclipse-workspace\\Basics\\Assignment");
		
		Thread.sleep(3000);
		
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='file-submit']"));
		uploadBtn.click();
		
		WebElement Msg = driver.findElement(By.xpath("driver.findElement(By.xpath(\"//h3[normalize-space()='File Uploaded!']\"))"));
		String ActualMsg = Msg.getText();
		
		String expectedMsg = "File Uploaded!";
		
		Thread.sleep(3000);
		
		assertEquals(expectedMsg, ActualMsg);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}

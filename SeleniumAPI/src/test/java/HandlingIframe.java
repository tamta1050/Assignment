import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class HandlingIframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		driver.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 450);");
		
		Thread.sleep(2000); 
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000); 
		
		WebElement input =  driver.findElement(By.cssSelector("input[type='text']"));
		
		input.sendKeys("Iframe Located");
		
		driver.quit();
		
	}

}

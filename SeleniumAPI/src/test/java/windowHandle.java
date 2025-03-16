import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class windowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		
		String Mainwindow = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		WebElement newWindow = driver.findElement(By.xpath("//li[@id='Open New Window']"));
		newWindow.click();
		
		driver.findElement(By.cssSelector("div[class='single_tab_div resp-tab-content resp-tab-content-active'] a[class='button e.g. button_hilite button_pale small_button']")).click();

	    
		Set<String> allwindow = driver.getWindowHandles();
		
		for(String handle : allwindow) {
			if(!handle.equals(Mainwindow)) {
				driver.switchTo().window(Mainwindow);
			}
		}
		
		System.out.println("New Window Tiltle" + driver.getTitle());
		
		
		
		
	
	}

}

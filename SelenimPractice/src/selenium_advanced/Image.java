package selenium_advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.debugger.model.CallFrameId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  // Chrome browser 
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Image.html");
		
		
		
		WebElement firstImg=driver.findElement(By.xpath("//*[contains(@src, 'home')]"));
		firstImg.click();
		
		driver.navigate().back();
		
		WebElement secImg=driver.findElement(By.xpath("//*//*[contains(@src, 'abcd')]"));
		//"naturalWidth=0"
		
		if (secImg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
		}else {
			System.out.println("Image is not broken");
		}
		
	}

}

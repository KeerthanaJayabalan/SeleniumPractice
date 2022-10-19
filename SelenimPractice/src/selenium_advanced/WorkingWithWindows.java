package selenium_advanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithWindows {

	public static void main(String[] args) {
		// http://testleaf.herokuapp.com/pages/Window.html
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://testleaf.herokuapp.com/pages/Window.html");

String oldWindow=driver.getWindowHandle();
WebElement homePage=driver.findElement(By.id("home"));
homePage.click();
Set<String> openedWindows=driver.getWindowHandles();
for (String newWindow : openedWindows) {
	driver.switchTo().window(newWindow);
}

WebElement buttonBox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
buttonBox.click();
driver.close();

driver.switchTo().window(oldWindow);

WebElement multipleWindows=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
multipleWindows.click();
Set<String> totalNoOfOpenedWindows=driver.getWindowHandles();
int n=totalNoOfOpenedWindows.size();
System.out.println(n);


WebElement doNotCLoseMeButton=driver.findElement(By.id("color"));
doNotCLoseMeButton.click();

Set<String> allWindows=driver.getWindowHandles();
for (String windows : allWindows) {
	if(!windows.equals(oldWindow)) {
		driver.switchTo().window(windows);
		driver.close();
	}
}


WebElement waitButton=driver.findElement(By.xpath("//*[@id=\'color\']"));
waitButton.click();


	}

}

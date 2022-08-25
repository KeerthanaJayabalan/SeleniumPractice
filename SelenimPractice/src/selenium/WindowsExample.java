package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://testleaf.herokuapp.com/pages/Window.html");

String oldWindow=driver.getWindowHandle();
WebElement homeButton=driver.findElement(By.id("home"));
homeButton.click();
Set<String> allWindows=driver.getWindowHandles();
for (String newWindow : allWindows) {
	driver.switchTo().window(newWindow);
}

WebElement buttonBox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img"));
buttonBox.click();
driver.close();
driver.switchTo().window(oldWindow);
 WebElement openMultiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
 openMultiple.click();
 int numberOfOpenedWindows=driver.getWindowHandles().size();
 System.out.println(numberOfOpenedWindows);
 
 WebElement doNotCloseMe=driver.findElement(By.id("color"));
 doNotCloseMe.click();
 
 Set<String> handles=driver.getWindowHandles();
 
for (String newWindows : handles) {
	if(!newWindows.equals(oldWindow)) {
		driver.switchTo().window(newWindows);
		driver.close();
}
	
}
driver.quit();
	}

}

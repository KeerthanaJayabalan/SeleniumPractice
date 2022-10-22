package selenium_advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Link.html");
		WebElement homePageLink=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		driver.navigate().back();
		WebElement whrToGo=driver.findElement(By.partialLinkText("Find where"));
		String whr=whrToGo.getAttribute("href");
		System.out.println(whr);
		
		WebElement verifyBroken=driver.findElement(By.linkText("Verify am I broken?"));
		verifyBroken.click();
		String title=driver.getTitle();
if(title.contains("404")) {
	System.out.println("Link is broken");
}
driver.navigate().back();

homePageLink.click();
driver.navigate().back();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
List<WebElement> linkCount =driver.findElements(By.tagName("a"));
int totalLinks=linkCount.size();
System.out.println("Total links are "+totalLinks);
	}

}

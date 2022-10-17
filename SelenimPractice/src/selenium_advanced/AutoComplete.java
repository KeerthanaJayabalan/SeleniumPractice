package selenium_advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  // Chrome browser 
		driver.get("https://www.google.com/");

		//WebDriverWait driverWait=new WebDriverWait(driver, 60);
		//driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("tags")));


		WebElement input=driver.findElement(By.name("q"));
		input.sendKeys("g");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebDriverWait driverWait=new WebDriverWait(driver, 30);
		//driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li")));	

List<WebElement> list=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li"));
		for (WebElement webElement : list) {
			if(webElement.getText().equals("gold rate today")) {
				webElement.click();
				break;
			}
		}
	}

}

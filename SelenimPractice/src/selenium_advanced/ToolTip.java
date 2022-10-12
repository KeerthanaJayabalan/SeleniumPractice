package selenium_advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe"); // browser name and location
		WebDriver driver=new ChromeDriver(); //chrome browser launch
		driver.get("https://jqueryui.com/tooltip/");

		driver.switchTo().frame(0);
		String toolTip=driver.findElement(By.id("age")).getAttribute("title");
		System.out.println(toolTip);
	}

}

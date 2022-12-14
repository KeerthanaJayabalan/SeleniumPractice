package selenium_advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");


		driver.switchTo().frame(0);

		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To=driver.findElement(By.id("droppable"));

		Actions actions=new Actions(driver);
		//actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		actions.dragAndDrop(From, To).build().perform();

	}

}

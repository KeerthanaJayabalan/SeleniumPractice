package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(dropDown1);
		select.selectByIndex(0);
		
		WebElement dropDown2=driver.findElement(By.name("dropdown2"));
		Select select2=new Select(dropDown2);
		select2.selectByVisibleText("Loadrunner");
		
		WebElement dropDown3=driver.findElement(By.id("dropdown3"));
		Select select3=new Select(dropDown3);
		select3.selectByValue("2");
		
		WebElement dropDown4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select select4=new Select(dropDown4);
		List<WebElement> list=select4.getOptions();
		System.err.println(list);
		
		WebElement dropDown5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		dropDown5.sendKeys("Appium");
		
		WebElement dropDown6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
		Select select5=new Select(dropDown6);
		select5.selectByValue("1");
		select5.selectByValue("2");
		select5.selectByValue("3");
		
		//driver.quit();
	}

}

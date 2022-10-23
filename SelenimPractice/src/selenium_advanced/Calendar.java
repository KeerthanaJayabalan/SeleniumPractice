package selenium_advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Calendar.html");
		
		WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.click();
		
		////a[@title='Next']
		WebElement nextButton=driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		WebElement nextButton1=driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton1.click();
		WebElement nextButton2=driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton2.click();
		
		//a[contains(text(), '10')]
		
		WebElement selectDate=driver.findElement(By.xpath("//a[contains(text(), '10')]"));
		selectDate.click();
	}

}

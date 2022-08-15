package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// http://testleaf.herokuapp.com/pages/Alert.html
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
       WebElement alertBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
       alertBox.click();
       Alert alert=driver.switchTo().alert();
       alert.accept();
       
       WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
       confirmBox.click();
       Alert alert2=driver.switchTo().alert();
       alert.dismiss();
       
       WebElement promptBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
       promptBox.click();
       Alert alert3=driver.switchTo().alert();
       alert3.sendKeys("Design Experts");
       alert3.accept();
       
       WebElement linebreakBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button"));
       linebreakBox.click();
       Alert alert4=driver.switchTo().alert();
       alert4.accept();
	}

}

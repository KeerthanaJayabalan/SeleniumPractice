package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
WebElement javaBox=	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
javaBox.click();

WebElement selenium=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]"));
boolean seleniumSelected=selenium.isSelected();
System.out.println(seleniumSelected);

WebElement notSelected=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
WebElement isSelected=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));

if (notSelected.isSelected()) {
	notSelected.click();
} else {
isSelected.click();
}

WebElement option1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]"));
option1.click();
WebElement option2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]"));
option2.click();
WebElement option3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]"));
option3.click();
WebElement option4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]"));
option4.click();
WebElement option5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[5]"));
option5.click();
WebElement option6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[6]"));
option6.click();

	}

}

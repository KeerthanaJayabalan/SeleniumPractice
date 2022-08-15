package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.css.model.StyleSheetOrigin;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://testleaf.herokuapp.com/pages/Button.html");
WebElement positionButton=driver.findElement(By.id("position"));
Point  xyPoint=positionButton.getLocation();
int xValue=xyPoint.getX();
int yValue=xyPoint.getY();
System.out.println("X value is: "+xValue + "Y value is: "+yValue);
WebElement colorButton=driver.findElement(By.id("color"));
String color=colorButton.getCssValue("background-color");
System.out.println(color);

WebElement sizeButton=driver.findElement(By.id("size"));
int height=sizeButton.getSize().getHeight();
int width=sizeButton.getSize().getWidth();
System.out.println("Height is: "+ height + "Width is: "+width);

WebElement homeButton=driver.findElement(By.id("home"));
homeButton.click();
	}

}

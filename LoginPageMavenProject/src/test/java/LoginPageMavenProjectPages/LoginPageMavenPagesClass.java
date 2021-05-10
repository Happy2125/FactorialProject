package LoginPageMavenProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageMavenPagesClass {

	private static WebElement element = null;
	
	//Find Username
	public static WebElement userElement(WebDriver driver)
	{
		element = driver.findElement(By.id("username"));
		return element;
	}
	
	//Find Password
	public static WebElement passwordElement(WebDriver driver)
	{
		element = driver.findElement(By.id("password"));
		return element;
	}
	
	//Success flash message
	public static WebElement sucessElement(WebDriver driver)
	{
		element = driver.findElement(By.id("flash"));
		return element;
	} 
	
	//Error flash message
	public static WebElement failElement(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		return element;
	} 
}

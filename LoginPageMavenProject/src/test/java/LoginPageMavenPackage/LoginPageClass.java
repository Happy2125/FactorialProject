package LoginPageMavenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import LoginPageMavenProjectPages.LoginPageMavenPagesClass;

public class LoginPageClass 
{
	private static WebDriver driver = null;
	
	public static void main(String args[]) 
	{
		loginValidations();
	}
	public static void loginValidations()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver1.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://the-internet.herokuapp.com/login";
		driver.get(baseUrl);
		
		//Login with correct username
		LoginPageMavenPagesClass.userElement(driver).sendKeys("tomsmith");
		
		//Login with correct password
		LoginPageMavenPagesClass.passwordElement(driver).sendKeys("SuperSecretPassword!");
		
		//CLick on login
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		
		//Flash Message
		String textString = LoginPageMavenPagesClass.sucessElement(driver).getText();
		System.out.println(textString);
		
		//Click on logout
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();
				
		//Login with correct username
		LoginPageMavenPagesClass.userElement(driver).sendKeys("tomsmith");
		
		//Login with incorrect password
		LoginPageMavenPagesClass.passwordElement(driver).sendKeys("SuperSecretPassword");
		
		//Click on login
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		
		//Flash Message
		String failString = LoginPageMavenPagesClass.failElement(driver).getText();
		System.out.println(failString);
	}
}

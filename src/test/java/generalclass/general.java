package generalclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Interfaces.generals;

public class general implements generals
{
	WebDriver driver;
	@BeforeMethod
	public void launch_browser()
	{
		System.setProperty(key, values);
		 driver = new FirefoxDriver();
	}
	@Test 
	public void testing() throws IOException
	{
		driver.get(url);
		String un=DDT.fretch_data("sheet1", 0, 0);
		String pwd=DDT.fretch_data("sheet1", 0, 1);
		Pom p= new Pom(driver);
		p.Un(un);
		p.pwds(pwd);
		p.actns();
		
	}
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			screen.capture(driver);
		}
		driver.close();
	}
}

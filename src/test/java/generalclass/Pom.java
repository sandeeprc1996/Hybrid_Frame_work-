package generalclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement pwdd;
	
	@FindBy(name="login")
	private WebElement actns;
	
	Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Un(String un)
	{
		username.sendKeys(un);
	}
	public void pwds(String pwd)
	{
		pwdd.sendKeys(pwd);
	}
	public void actns()
	{
		actns.click();
	}
}

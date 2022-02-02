package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_page;

public class Actitime extends Base_page
{
@FindBy(id="username")
private WebElement user;

@FindBy(name="pwd")
private WebElement pass;

@FindBy(xpath="//div[.='Login ']")
private WebElement lgn_btn;

public Actitime(WebDriver driver)
{
	super(driver);
}
public void username(String usern)
{
	user.sendKeys(usern);
}
public void password(String passw)
{
	pass.sendKeys(passw);
}
public void login()
{
	lgn_btn.click();

}	
}

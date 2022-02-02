package test_scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic.Base_page;
import Generic.Basic_class;
import Generic.Generic_readexcel;
import Pom.Actitime;

public class LoginTestScript extends Basic_class
{
@Test
public void test() throws IOException 
{
	String username=Generic_readexcel.getData("sheet1", 0, 0);
	String password=Generic_readexcel.getData("sheet1", 1, 0);
	
	Actitime act=new Actitime(driver);
	act.username(username);
	act.password(password);
	act.login();
	
	
}
}

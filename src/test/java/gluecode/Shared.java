package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.GooglePage;
import utilities.SiteUtilityCloud;

public class Shared
{
	//declare common objects
	public RemoteWebDriver driver;
	public FluentWait<RemoteWebDriver> w;
	public GooglePage obj;
	public Scenario s; //to customize results file
	public SiteUtilityCloud u;
	
	@Before
	public void method(Scenario x)
	{
		this.s=x;
	}
}

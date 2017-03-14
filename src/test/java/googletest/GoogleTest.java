package googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {
	
	public void sampletest()
	{
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.google.co.in/?gfe_rd=cr&ei=ih7GWKTGKuLy8Afln6vQBw");
	}

}

package cucumbercasestudy.casestudies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class utilityclass
{
	static WebDriver driver;
	public static WebDriver openBrowser(String browsername)
	{

	if(browsername.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_c2a.04.30\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("Ie"))
	{
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\training_c2a.04.30\\Desktop\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	return driver;
	}
}

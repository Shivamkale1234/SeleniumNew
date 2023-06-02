package A_3webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_1Get {
	
	public class example1_get
	{
		public static void main(String[] args)
		{		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");	
		}
	}

}

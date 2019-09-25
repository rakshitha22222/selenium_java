package Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class webdriver {
	WebDriver driver=null;
  @Test
  public void Browerlaunch() {
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\BrowerDrivers\\IEDriverServer.exe" );
	  driver =new InternetExplorerDriver();
	  String url="http://www.google.com";
	  driver.get(url);
  }
}

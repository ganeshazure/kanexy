import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kanexy {
  @Test
  public void f() {
	  System.out.println("hi");
	  System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("https://kanexy.com/");
  }
}

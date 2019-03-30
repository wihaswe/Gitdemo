import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Test automation\\Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Test automation\\Jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.linkText("Sign in")).click();
		*/

		
		

	}

}

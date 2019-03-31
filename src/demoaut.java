import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoaut {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Test automation\\Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoaut.com/");
		
		System.out.println("wey gud ale");
		System.out.println("wey gud ale");
		System.out.println("wey gud ale");
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Test automation\\Jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.linkText("Sign in")).click();
		*/

		
		

	}

}

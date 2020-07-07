package webdriver;

/*Simples teste automatizado login 
 * usando API selenium webdriver
 * 
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginautomatizado {
	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//site
		driver.get("https://www.estantevirtual.com.br/login");
		//esperar
		
		//usuário 
		driver.findElement(By.id("username_or_email")).sendKeys("naiara.santos@live.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
		//senha
		driver.findElement(By.id("loginPage_pass")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
		//clicar em entrar
		driver.findElement(By.cssSelector("button.btn-ev:nth-child(1)")).click();	
		//.navbar-nav-new-account


		
	}
}

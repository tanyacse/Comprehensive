package Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Assesment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.eazydiner.com/");
		driver.findElement(By.xpath("//*[@id=\"city-name\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_city_content\"]/div[1]/ul/li[1]/div/a/div[2]/div[1]")).click();
		driver.findElement(By.id("help")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/section[3]/div/div/div[1]/div[1]/a/div[2]/h3")).click();
		driver.findElement(By.xpath("//*[@id=\"slotForm\"]/div/div/button")).click();
		driver.findElement(By.id("guest_name")).sendKeys("Tanya");
		driver.findElement(By.xpath("//*[@id=\"guest-form\"]/div/div[2]/div/div/input")).sendKeys("8789059274");
		driver.findElement(By.xpath("//*[@id=\"guest_email\"]")).sendKeys("tanya@gmail.com");
		driver.findElement(By.id("checkout-button")).click();

	}

}

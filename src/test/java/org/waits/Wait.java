package org.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Interview_7.30PM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//AlertExample
		//no need to switch the alert while using webdriver wait
//		driver.get("http://leafground.com/pages/Alert.html");
//		WebElement alBox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
//		alBox.click();
		WebDriverWait w=new WebDriverWait(driver,20);
//		Alert a = w.until(ExpectedConditions.alertIsPresent());
//		a.accept();
//		WebElement coBtn = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
//		coBtn.click();
//		a.accept();
//		WebElement pBox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
//		WebElement btn = w.until(ExpectedConditions.elementToBeClickable(pBox));
//		btn.click();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=MYPAYEESFTRVMP&ITM=nli_cms_ib_btn_index_banner4_d&_ga=2.178775527.252059149.1611674608-1157335847.1602102622&_gl=1*v63119*_ga*MTE1NzMzNTg0Ny4xNjAyMTAyNjIy*_ga_SKB78GHTFV*MTYxMTY3NjUyMi4yLjEuMTYxMTY3NjU1Mi4zMA..");
		WebDriver f = w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("HDisplay1.Rowset2")));
		WebElement uName = f.findElement(By.className("login-input type_UserPrincipal"));
		uName.sendKeys("Qwerty");	
		FluentWait<WebDriver> wt = w.withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(10)).ignoring(Throwable.class);
		WebDriver driver1 = wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame6")));
	}
}
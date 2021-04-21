package org.style;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Interview_7.30PM\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.crazysales.com.au/");
	WebElement ban = driver.findElement(By.xpath("//div[@class='Bannerslider-view-list']"));
	String st = ban.getAttribute("style");
    System.out.println(st);
    System.out.println(ban.getCssValue("position"));
    System.out.println(ban.getCssValue("left"));
    System.out.println(ban.getCssValue("width"));
    driver.close();
}
}

package org.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMA\\eclipse-workspace\\Interview_7.30PM\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		List<WebElement> tables = driver.findElements(By.tagName("table"));
//		int size = tables.size();
//		System.out.println(size);
//		//toget the particulat table
//		WebElement table4 = tables.get(3);
//		String attribute = table4.getAttribute("id");
//		System.out.println(attribute);
//		System.out.println("================================================");
		System.out.println("---------print the entire table------------------");
		//to get the all the rows 
		WebElement table = driver.findElement(By.id("countries"));
		
		List<WebElement> trows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			WebElement eachRow= trows.get(i);
			String rtext = eachRow.getText();
			System.out.println(rtext);		
		}
		System.out.println("------------Header only------------");

		for (int i = 0; i < trows.size(); i++) {
			WebElement eachRow= trows.get(i);
			List<WebElement> thead = eachRow.findElements(By.tagName("th"));
			for (WebElement thData : thead) {
				System.out.println(thData.getText());
			}
		}
		System.out.println("------------Each-row-Datas-----------------");
		for (WebElement eachRow2: trows) {
			List<WebElement> tdatas = eachRow2.findElements(By.tagName("td"));
			for (WebElement eachdata : tdatas) {
				System.out.println(eachdata.getText());
			}
		}
		System.out.println("----------check the value is present or not -----------------");
		for (int j = 0; j < trows.size(); j++) {
			WebElement eachRow3= trows.get(j);
			List<WebElement> tdata = eachRow3.findElements(By.tagName("td"));
			for (int k = 0; k < tdata.size(); k++) {
				WebElement eachdata = tdata.get(k);
				String dtext = eachdata.getText();
				if(dtext.equals("Canada")) {
					System.out.println(dtext);
				}
				//System.out.println("Row......"+j);
				System.out.println("Column....."+k);				
			}
			System.out.println(eachRow3.getText());

		}

		System.out.println("-------------Last-Row-------------------------");
		WebElement lastRow = trows.get(trows.size()-1);
		List<WebElement> lDatas = lastRow.findElements(By.tagName("td"));
		for (int j = 0; j < lDatas.size(); j++) {
			WebElement lData = lDatas.get(j);
			System.out.println(lData.getText());
		}

		System.out.println("----------Mid-Row------------");
		WebElement midRow = trows.get(trows.size()/2);
		List<WebElement> midDatas = midRow.findElements(By.tagName("td"));
		for (WebElement midData : midDatas) {
			System.out.println(midData.getText());
		}

		System.out.println("-----------Mid-Row-midData---------------");
		WebElement mRow = trows.get(trows.size()/2);
		List<WebElement> mDatas = mRow.findElements(By.tagName("td"));
		WebElement mData = mDatas.get(mDatas.size()/2);
		System.out.println(mData.getText());
	}
}



package org.cts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automate extends Base {

	@BeforeClass
	private void beforeClass() {
		getChromeDrive();
		loadUrl("https://blazedemo.com/");
	}

	@BeforeMethod
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	
	@Test(priority=-1)
	private void mainMethod2() {
		SecondPage second = new SecondPage();
		List<Float> l = new ArrayList<Float>();
		List<Float> l1 = new ArrayList<Float>();
		List<WebElement> row = second.getTable().findElements(By.tagName("tr"));
		for (int i = 1; i < row.size(); i++) {
			l.add(Float.parseFloat(row.get(i).getText().substring(row.get(i).getText().length() - 6)));
		}
		l1.addAll(l);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l.get(0));
		for (int i = 0; i < l.size(); i++) {
			if (l.get(0) == l1.get(i)) {
				int j = i + 1;
				WebElement choose = driver.findElement(By.xpath("(//input[@type='submit'])[" + j + "]"));
				btn(choose);
			}
		}
	}
	@Test(priority=-2)
	private void mainMethod1() {
		FirstPage first = new FirstPage();
		select(first.getDepatureCity(), 1);
		select(first.getDepatureCity(), 2);
		btn(first.getFind());
	}


	@Test(parameters = { "name", "address", "city", "code","number", "month", "year", "cname" })
	private void mainMethod3(String s1, String s2, String s3, String s4,  String s5, String s6, String s7,
			String s8) {
		ThirdPage third = new ThirdPage();
		enterType(third.getName(), s1);
		enterType(third.getAddress(), s2);
		enterType(third.getCity(), s3);
		enterType(third.getPinCode(), s4);
		select(third.getCard(), 0);
		enterType(third.getCardNo(), s5);
		enterType(third.getCardMonth(), s6);
		enterType(third.getCardYear(), s7);
		enterType(third.getName(), s8);
		btn(third.getRemember());
		btn(third.getPurchase());
	}

	@AfterMethod
	private void afterMethod() throws IOException {
		Date date = new Date();
		System.out.println(date);
		screenShot("C:\\Users\\ELCOT\\Desktop\\Daily Tasks\\screenshot\\blazedemo.png");
	}

	@AfterClass
	private void afterClass() {
		shutDown();
	}
}

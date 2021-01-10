package org.cts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo extends Base {
	public static void main(String[] args) throws InterruptedException {
		getChromeDrive();
		loadUrl("https://blazedemo.com/");
		FirstPage first = new FirstPage();
		select(first.getDepatureCity(), 1);
		select(first.getDepatureCity(), 2);
		btn(first.getFind());
		WebElement table = driver.findElement(By.xpath("//table[@class='table']"));
		List<Float> l = new ArrayList<Float>();
		List<Float> l1 = new ArrayList<Float>();
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 1; i < row.size(); i++) {
			WebElement element = row.get(i);
			String text = element.getText();
			int length = text.length();
			String sub = text.substring(length - 6);
			float f = Float.parseFloat(sub);
			l.add(f);
		}
		l1.addAll(l);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l.get(0));
		for (int i = 0; i < l.size(); i++) {
			if (l.get(0) == l1.get(i)) {
				System.out.println(i);
				int j = i + 1;
				WebElement clk = driver.findElement(By.xpath("(//input[@type='submit'])[" + j + "]"));
				clk.click();
			}
		}
		ThirdPage third=new ThirdPage();
		enterType(third.getName(), "KING");
		enterType(third.getAddress(),"1/26,Omr");
		enterType(third.getCity(), "Chennai");
		enterType(third.getPinCode(),"636111");
		select(third.getCard(),0);
		enterType(third.getCardNo(),"1234567890123456");
		enterType(third.getCardMonth(), "07");
		enterType(third.getCardYear(),"2000");
		enterType(third.getName(),"Jhon");
		btn(third.getRemember());
		btn(third.getPurchase());
	}
}
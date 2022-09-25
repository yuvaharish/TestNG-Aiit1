package pageExe;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageExe {
	
	public static void main(String[] args) {
		int[] a={1, 2, 0, 4, 6, 0, 9, 0, 4, 0, 3, 0, 9, 0, 1, 0, 3, 0};
		LinkedList li = new LinkedList<>();
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==0) {
				li.addFirst(a[i]);
			}else {
				li.addLast(a[i]);
			}
		}
		
		System.out.println(li);
	
	}

}

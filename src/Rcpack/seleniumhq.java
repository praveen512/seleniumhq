package Rcpack;


import com.thoughtworks.selenium.*;

import java.util.regex.Pattern;

@SuppressWarnings({ "deprecation", "unused" })
public class seleniumhq extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("https://www.google.co.uk/", "*chrome");
	}
	public void testUntitled() throws Exception {
		selenium.open("/");
		selenium.windowMaximize();
		selenium.type("id=gbqfq", "seleniumhq");
		selenium.click("id=gbqfb");
		selenium.waitForPageToLoad("30000");
		selenium.click("xpath=//div/h3/a");
		selenium.click("link=Download");
		selenium.click("link=install some plugins");
		selenium.click("link=plugin tutorial page");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Build and Preferences");
		selenium.waitForPageToLoad("30000");
	}
}


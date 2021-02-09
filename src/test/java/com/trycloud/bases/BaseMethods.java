package com.trycloud.bases;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BaseMethods extends SetupDriver implements BrowserUtils {
  // find by xpath
  public WebElement xPath(String xPathLocator){return driver.findElement(By.xpath(xPathLocator));}
  public List<WebElement> xPathList(String xPathLocator){return driver.findElements(By.xpath(xPathLocator));}
  // find by css selectors
  public WebElement cssSel(String cssLocator){return driver.findElement(By.cssSelector(cssLocator));}
  public List<WebElement> cssSelList(String cssLocator){return driver.findElements(By.cssSelector(cssLocator));}

  // some common actions before test
  public void loginTryCloud(){
    WebElement userNameInputField = xPath("//input[@id='user']");
    userNameInputField.clear();
    userNameInputField.sendKeys(ConfigurationReader.getProperty("userName1"));
    sleep(1);

    WebElement passwordInputField = xPath("//input[@id='password']");
    passwordInputField.clear();
    passwordInputField.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    sleep(1);
  }
}


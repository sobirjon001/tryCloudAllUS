package com.trycloud.bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BaseMethods extends SetupDriver{
  // find by xpath
  public WebElement xPath(String xPathLocator){return driver.findElement(By.xpath(xPathLocator));}
  public List<WebElement> xPathList(String xPathLocator){return driver.findElements(By.xpath(xPathLocator));}
  // find by css selectors
  public WebElement cssSel(String cssLocator){return driver.findElement(By.cssSelector(cssLocator));}
  public List<WebElement> cssSelList(String cssLocator){return driver.findElements(By.cssSelector(cssLocator));}
}

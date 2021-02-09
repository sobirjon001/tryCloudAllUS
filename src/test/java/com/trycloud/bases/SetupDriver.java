package com.trycloud.bases;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class SetupDriver {
  public static WebDriver driver;
  public static Actions action;

  static {
    driver = Driver.getDriver();
    action = new Actions(driver);
  }
}

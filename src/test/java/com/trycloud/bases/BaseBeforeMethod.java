package com.trycloud.bases;

import com.trycloud.utilities.ConfigurationReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseBeforeMethod extends BaseMethods {

  @BeforeMethod
  public void setupMethod(){
    driver.get(ConfigurationReader.getProperty("Environment2"));
  }

  @AfterMethod
  public void  tearDownMethod(){
    driver.close();
  }

}

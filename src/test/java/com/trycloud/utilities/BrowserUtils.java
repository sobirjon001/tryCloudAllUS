package com.trycloud.utilities;

public interface BrowserUtils {

  default void sleep(int seconds){
    seconds *= 1000;
    try {
      Thread.sleep(seconds);
    } catch (InterruptedException e) {
      System.out.println("Something happened in sleep method!");
    }
  }

}

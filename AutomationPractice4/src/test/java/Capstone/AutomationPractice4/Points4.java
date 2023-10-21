package Capstone.AutomationPractice4;

import org.testng.annotations.Test;

import Amazon.pages.HomeOfFacebook;
import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points4 extends Utilities {
  @Test(dataProvider = "Set")
  public void f(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  home.userName(n);
	  home.psswd(s);
	  home.login();
  }

  @DataProvider
  public Object[][] Set() {
    return new Object[][] {
      new Object[] { "Ali", "johndoe" },
      new Object[] { "Saleem", "defender" },
      new Object [] {"Rabia", "annie"},
    };
  }
}

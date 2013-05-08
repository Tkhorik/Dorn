package sanity;

//import java.util.regex.Pattern;
//import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.esteru.selenium.factory.WebDriverFactory;
//import static org.openqa.selenium.support.ui.ExpectedCondition.*;
//import static org.hamcrest.CoreMatchers.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import com.google.common.base.Predicate;

public class login {
  private WebDriver driver;
  private WebDriverWait wait;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  //public   setUp() throws Exception {
  public void setUp() throws Exception {
  driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
  baseUrl = "https://my.roboforex.com/";
  wait = new WebDriverWait(driver, 10);
  }
  
    //  baseUrl = "https://my.roboforex.ru/";
    
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 // }

  @Test
  public void testLogin() throws Exception {
	  goToMainPage();
	  login("tom@mail.md", "Secret12");
	  //verifyContent();
	 logout();
	 // login("roboforex@mail.md", "Secret12");
	 //veryfyHeader();
	  
	 //verifyLogOutPage();
	 //verifyLogoutPageMechanism();
   
  }
  

  
  private void veryfyHeader() {
// TODO Auto-generated method stub
//wait.until(visibilityOfElementLocated(By.linkText("Выйти"))).click();
//  wait.until(alertis)
}



private void goToMainPage() {
	// TODO Auto-generated method stub
	  driver.get(baseUrl + "/ru/login/");
}

private void login(String username, String password) {
	  // type | id=login-email | tom@mail.md
	
	  driver.findElement(By.id("login-email")).clear();
	  driver.findElement(By.id("login-email")).sendKeys(username);
	  driver.findElement(By.id("login-password")).clear();
	  driver.findElement(By.id("login-password")).sendKeys(password);
	  driver.findElement(By.cssSelector("#login-submit > button.fSubmit")).click();
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.class(fSubmit))).click();
	  
	  }


private void verifyContent() {
	driver.findElement(By.cssSelector("button.fSubmit")).click();
	  // verifyElementPresent | id=t-user-info | 
	  try {
	    assertTrue(isElementPresent(By.id("t-user-info")));
	  } catch (Error e) {
	 verificationErrors.append(e.toString());
	  
	  }
	
}

private void logout() {
	driver.findElement(By.id("t-user-logout")).click();

	
}

private void verifyLogOutPage() {
	
	
	// TODO Auto-generated method stub
	
}

private void verifyLogoutPageMechanism() {
	// TODO Auto-generated method stub
	
}



@After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alert.getText();
    } finally {
      acceptNextAlert = true;
    }
  }
}

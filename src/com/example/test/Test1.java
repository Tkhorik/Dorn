package com.example.test;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://my.roboforex.ru/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAllpagesEnCopy() throws Exception {
    driver.get(baseUrl + "/en/login/");
    driver.findElement(By.id("login-email")).clear();
    driver.findElement(By.id("login-email")).sendKeys("tom@mail.md");
    driver.findElement(By.id("login-password")).clear();
    driver.findElement(By.id("login-password")).sendKeys("Secret12");
    driver.findElement(By.cssSelector("button.fSubmit")).click();
    driver.get(baseUrl + "/en/login");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "<td>verifyElementPresent</td>");
    driver.get(baseUrl + "/en/trading-account/open-trading-account/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/accounts/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/contest-account/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/open-trading-account/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/open-demo-account/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/contest-open/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/change-leverage/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/change-password/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/open-orders/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/account-history/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/contests/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/quotes/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/open-zulu-real/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/trading-account/open-zulu-demo/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/operations/deposit-funds/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/operations/deposit-funds/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/operations/rebate/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/operations/inner-exchange-rates/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/operations/payment-details-ru/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/operations/payoneer/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/help/add-a-ticket/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/help/add-a-ticket/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get("http://my.roboforex.com/files/filemanager/file/mt4setup.exe");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get("http://webtrader.roboforex.ru");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get("http://files.metaquotes.net/roboforex.lp/mt4/roboforex4mobilesetup.cab");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get("https://play.google.com/store/apps/details?id=net.metaquotes.metatrader4");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get("https://play.google.com/store/apps/details?id=net.metaquotes.metatrader5");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/personal-information/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/tradingcentral/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/forex-education/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/personal-information/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/change-password/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/verification/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/sms-verification/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/vps2/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/documents/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/wb-key/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/profile/forum/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/referral-links/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/referral-links/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/sites/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/advertising/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/commission-archive/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/clients/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/contest-clients/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/comission/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/calculator/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/partner-account/agreements/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/copyfx/providers/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/copyfx/providers/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/copyfx/providers/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/copyfx/open_copyfx_demo/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.get(baseUrl + "/en/copyfx/open_trading_copyfx/");
    try {
      assertTrue(isElementPresent(By.xpath("//div[@id='right']/div[2]/a/img")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
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
}

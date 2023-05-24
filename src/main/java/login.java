import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class login {
    @Test
    public void test() throws InterruptedException {
         WebDriver driver = null;
        //ApplicationProperties applicationProperties = ApplicationProperties.INSTANCE;
          System.setProperty("webdriver.chrome.logfile", "TestLog.txt");
            WebDriverManager.chromedriver().arch64().setup();
            driver = new ChromeDriver();
            driver.get("https://talentcentral-2a.eu.shl.zone/admin/login");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            WebElement E1 = driver.findElement(By.id("username"));
            E1.sendKeys("shreyangi.kumari@shl.com");
            WebElement E2 = driver.findElement(By.id("password"));
            E2.sendKeys("Today123!");
            Thread.sleep(3000);
            WebElement E3 = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonAccept"));
            E3.click();
            WebElement E4= driver.findElement(By.cssSelector(".btn.btn-signin.signInBtnClick"));
            E4.click();
            Thread.sleep(3000);
            WebElement E5= driver.findElement(By.className("menu-text"));
            E5.click();
            Thread.sleep(3000);
            WebElement Searchcompany = driver.findElement(By.linkText("Search Company"));
            Searchcompany.click();
            Thread.sleep(3000);
            WebElement Company = driver.findElement(By.xpath("//input[@aria-controls='allcompaniestable']"));
            Company.sendKeys("3010694");
            Thread.sleep(3000);
            WebElement SelectCom = driver.findElement(By.className("company-link"));
            SelectCom.click();
            Thread.sleep(3000);
            WebElement A = driver.findElement(By.cssSelector(".shl-icon_arrow_small_down.arrow"));
            A.click();
            WebElement B = driver.findElement(By.id("create-new-project-item"));
            B.click();
            Thread.sleep(2000);
            WebElement C = driver.findElement(By.id("btnSelectProjectType"));
            C.click();
            Thread.sleep(3000);
            WebElement D = driver.findElement(By.cssSelector(".input-xxlarge.form-control.col-sm-12.col-xs-12"));
            D.sendKeys("Test");
            WebElement E = driver.findElement(By.className("shl-icon_arrow_small_right"));
            E.click();
            Thread.sleep(3000);
            WebElement F = driver.findElement(By.id("assessment_profile_radio_12348"));
            F.click();
            Thread.sleep(3000);
           // WebElement G= driver.findElement(By.className("selector chk bigger-140 icon-check-empty"));
          //  G.click();
             Actions ac = new Actions(driver);
             ac.sendKeys(Keys.PAGE_DOWN).build().perform();
      Thread.sleep(3000);
             WebElement userGp = driver.findElement(By.xpath("//span[(text()= 'Test Shreyangi1u')]"));
             //userGp.click();
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", userGp);
      Thread.sleep(2000);
      WebElement MUL = driver.findElement(By.id("multiUseLinkChk"));
      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
      executor1.executeScript("arguments[0].click();", MUL);
      Thread.sleep(2000);
      WebElement Create = driver.findElement(By.name("publishProject"));
      JavascriptExecutor executor2 = (JavascriptExecutor)driver;
      executor2.executeScript("arguments[0].click();", Create);


      driver.quit();






    }

}

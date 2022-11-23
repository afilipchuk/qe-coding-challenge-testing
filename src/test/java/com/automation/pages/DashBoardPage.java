package com.automation.pages;

import com.automation.utilities.BrowserUtil;
import com.automation.utilities.Driver;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

  public DashBoardPage() {
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(xpath = "//h1[contains(text(), 'Get Github Repos')]")
  public WebElement pageHeader;

  @FindBy(xpath = "//p[@class='repo-description']")
  public List<WebElement> reposDescription;

  @FindBy(xpath = "//a[contains(@href, 'https://github')]")
  public List<WebElement> githubLinks;

  @FindBy(id = "username")
  public WebElement searchField;

  @FindBy(xpath = "//label[contains(text(), 'Github Username')]")
  public WebElement searchFieldTitle;

  @FindBy(xpath = "//*[contains(text(), 'No repos')]")
  public WebElement noReposTitle;

  @FindBy(css = "button.submit")
  public WebElement goButton;

  @FindBy(xpath = "//strong[contains(text(), 'Github user not found')]")
  public WebElement errorUserNotFound;

  @FindBy(xpath = "//strong[contains(text(), 'Success')]")
  public WebElement successfulMessage;

  @FindBy(xpath = "//*[contains(text(), 'Found')]")
  public WebElement resultSearchInfo;

  public void typeInSearchField(String parameter) {
    searchField.sendKeys(parameter);
  }

  public void verifyIAmOnDashboard() {
    BrowserUtil.waitForVisibility(pageHeader, 1);
    Assert.assertTrue(pageHeader.isDisplayed());
    Assert.assertTrue(searchFieldTitle.isDisplayed());
    Assert.assertTrue(searchField.isDisplayed());
    Assert.assertTrue(goButton.isDisplayed());
    Assert.assertTrue(noReposTitle.isDisplayed());
  }

  public void clickGoButton() {
    BrowserUtil.waitForClickability(goButton, 1);
    goButton.click();
  }

  public void pressEnterKey() {
    searchField.sendKeys(Keys.ENTER);
  }

  public void verifySuccessfulMessage() {
    Assert.assertTrue(successfulMessage.isEnabled());
  }

  public void verifyNoUserFoundError() {
    BrowserUtil.waitForVisibility(errorUserNotFound, 1);
    Assert.assertTrue(errorUserNotFound.isDisplayed());
  }

  public void checkGithubUrls() {
    githubLinks.forEach(each -> {
      String title = each.getText();
      each.click();
      BrowserUtil.waitFor(1);
      BrowserUtil.switchToWindowContainingTitle(title);
      WebElement githubTitle = Driver.getDriver().findElement(By.xpath("//a[contains(text(), '" + title + "')]"));
      Assert.assertTrue(githubTitle.isDisplayed());
      String githubUrl = Driver.getDriver().getCurrentUrl();
      Assert.assertTrue(githubUrl.contains(title));
      BrowserUtil.switchToWindow("Get Github Repos");
    });
  }

  public void checkReposDescription() {
    reposDescription.forEach(each -> {
      String description = each.getText();
      Assert.assertTrue(!description.isEmpty() | description.equals("–"));
    });
  }

  public void verifyFoundRepositories() {
    Assert.assertTrue(resultSearchInfo.isDisplayed());
  }
}

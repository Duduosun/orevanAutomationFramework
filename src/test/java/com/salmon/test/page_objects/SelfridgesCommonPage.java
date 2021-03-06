package com.salmon.test.page_objects;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by tfasoyiro on 14/08/2015.
 */

public class SelfridgesCommonPage extends PageObject {

    private String commonPageTitle = "Selfridges";
    private String homePageTitle = "Designer Fashion, Accessories & More - Shop Online at Selfridges";

    //Header
    private By plpBody = By.xpath(".//*[@id='screenR']");
    private By plpSearch = By.xpath(".//*[@id='plp-search']");

    private By topBar = By.id("globalNav");
    private By xTopBar = By.xpath(".//*[@id='globalNav']");
    private By cTopBar = By.className("wrapper");
    private By nationalFlag = By.className("translateFlag");
    private By xCurrency = By.xpath(".//*[@id='globalNav']/div/div/div/a/span");
    private By logo = By.id("logo");
    private By welcome = By.className("em");
    private By xWelcome = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[1]/span");
    private By cssHelloUser = By.cssSelector(".personsName>b");

    //Avatar
    private By accountHead = By.className("accountnavlink");
    private By wishList = By.className("wishlist topLevel");
    private By xWishList = By.xpath(".//*[@id='xhrUncachedNav']/ul/li[2]/a");
    private By shoppingBag = By.className("icon");
    private By searchIcon = By.className("searchIcon");

    //Mega Menu
    private By topLevelCategory = By.id("megaMenu");
    private By xTopLevelCategory = By.xpath(".//*[@id='megaMenu']");
    private By xMEGAONE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[1]/a");
    private By xMEGATWO = By.xpath(".//*[@id='megaMenu']/nav/ul/li[2]/a");
    private By xMEGATHREE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[3]/a");
    private By xMEGAFOUR = By.xpath(".//*[@id='megaMenu']/nav/ul/li[4]/a");
    private By xMEGAFIVE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[5]/a");
    private By xMEGASIX = By.xpath(".//*[@id='megaMenu']/nav/ul/li[6]/a");
    private By xMEGASEVEN = By.xpath(".//*[@id='megaMenu']/nav/ul/li[7]/a");
    private By xMEGAEIGHT = By.xpath(".//*[@id='megaMenu']/nav/ul/li[8]/a");
    private By xMEGANINE = By.xpath(".//*[@id='megaMenu']/nav/ul/li[9]/a");

    //Category Title
    private By categoryTitle = By.xpath(".//*[@id='main']/div[1]/h1");

    //Footer
    private By footerTop = By.id("footerTop");
    private By footerBody = By.id("footerBody");
    private By footerBottom = By.id("footerBottom");

    public void clickMegaMenu(String menu) {

        switch (menu) {
            case "MegaMenuOne": {
                waitForExpectedElement(xMEGAONE).click();
                waitForExpectedElement(xMEGAONE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuTwo": {
                waitForExpectedElement(xMEGATWO).click();
                waitForExpectedElement(xMEGATWO).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuThree": {
                waitForExpectedElement(xMEGATHREE).click();
                waitForExpectedElement(xMEGATHREE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuFour": {
                waitForExpectedElement(xMEGAFOUR).click();
                waitForExpectedElement(xMEGAFOUR).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuFive": {
                waitForExpectedElement(xMEGAFIVE).click();
                waitForExpectedElement(xMEGAFIVE).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuSix": {
                waitForExpectedElement(xMEGASIX).click();
                waitForExpectedElement(xMEGASIX).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuSeven": {
                waitForExpectedElement(xMEGASEVEN).click();
                waitForExpectedElement(xMEGASEVEN).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuEight": {
                waitForExpectedElement(xMEGAEIGHT).click();
                waitForExpectedElement(xMEGAEIGHT).sendKeys(Keys.RETURN);
                break;
            }
            case "MegaMenuNine": {
                waitForExpectedElement(xMEGANINE).click();
                waitForExpectedElement(xMEGANINE).sendKeys(Keys.RETURN);
                break;
            }
        }
    }
    public void visibleAvatar(){
        waitForExpectedElement(accountHead);
        waitForExpectedElement(xWishList);
        waitForExpectedElement(shoppingBag);
        waitForExpectedElement(searchIcon);
    }
    public void clickLogo(){
        waitForExpectedElement(logo).click();
    }
    public void verifyCategoryHeading(String category){
        waitForExpectedElement(categoryTitle);
        category = waitForExpectedElement(categoryTitle).getText();
    }

    public String returnPLPSearchResult (){
       return waitForExpectedElement(plpSearch) .getText();
    }
    public String stringRegisteredUser(){
        return waitForExpectedElement(cssHelloUser).getText();
    }
    public String stringHomePageTitle(){
        return homePageTitle;
    }
}

package com.salmon.test.step_definitions.gui.smoke;


import com.salmon.test.page_objects.SelfridgesCommonPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;

import javax.swing.*;
import java.security.Key;

import static org.testng.Assert.assertTrue;

/**
 * Created by Tola on 17/08/2015
 */
public class SelfridgesCommonPageSteps {

    private SelfridgesCommonPage selfridgesCommonPage;

    public SelfridgesCommonPageSteps(SelfridgesCommonPage selfridgesCommonPage){
        this.selfridgesCommonPage = selfridgesCommonPage;
    }

    @When("^User Navigate Mega Menu \"([^\"]*)\"$")
    public void User_Navigate_Mega_Menu(String megamenu) throws Throwable {
        selfridgesCommonPage.clickMegaMenu(megamenu);
        selfridgesCommonPage.visibleAvatar();
    }

    @Then("^Search Result contains \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Search_Result_contains_and(String word, String phrase) throws Throwable {
        selfridgesCommonPage.visibleAvatar();
        assertTrue(selfridgesCommonPage.returnPLPSearchResult().contains(word));
        assertTrue(selfridgesCommonPage.returnPLPSearchResult().contains(phrase));
    }
}

package org.piit.searchPage;

import base.commonApi;
import org.piit.FindAnAgentPage;
import org.piit.InsurancePage;
import org.piit.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest extends commonApi {
    @Test
    public void searchPageTest() {
        InsurancePage homePageV = new InsurancePage(driver);
        SearchPage searchPage = new SearchPage(driver);
//      Assert.assertTrue(homePageV.searchField.isEnabled());
        homePageV.search();
        searchPage.searchField();

        searchPage.searchBtn();

        searchPage.auto();
waitFor(2);
        searchPage.whatToDoAfterAccident();
        ;









    }
}

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
//        Assert.assertTrue(SearchPage.searchPage.isEnabled());
        homePageV.search();
        searchPage.searchField();
        waitFor(2);
        searchPage.searchBtn();
        waitFor(2);
        searchPage.auto();
        waitFor(2);
        searchPage.whatToDoAfterAccident();
        waitFor(2);









    }
}

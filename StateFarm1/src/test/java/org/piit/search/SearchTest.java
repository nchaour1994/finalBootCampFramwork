package org.piit.search;

import base.commonApi;
import org.piit.InsurancePage;
import org.piit.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends commonApi {
    @Test
    public void search() {
        InsurancePage homePageV = new InsurancePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertEquals(getTitle(), "State Farm Auto Insurance & More for 100 Years. Get a Quote - State Farm®");
        Assert.assertTrue(homePageV.search.isEnabled());
        homePageV.search();
        Assert.assertTrue(searchPage.searchField.isEnabled());
        searchPage.searchField();
        Assert.assertTrue(searchPage.searchBtn.isEnabled());
        searchPage.searchBtn();
        Assert.assertTrue(searchPage.auto.isEnabled());
        searchPage.auto();
        waitFor(2);
        Assert.assertTrue(searchPage.whatToDoAfterAccident.isEnabled());
        searchPage.whatToDoAfterAccident();
        Assert.assertEquals(getTitle(), "What to Do After a Car Accident - State Farm®");










    }
}

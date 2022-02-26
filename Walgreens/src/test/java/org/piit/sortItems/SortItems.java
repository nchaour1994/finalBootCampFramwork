package org.piit.sortItems;

import base.commonApi;
import org.piit.HomePage;
import org.piit.ResultPage;
import org.testng.annotations.Test;

public class SortItems extends commonApi {

    @Test
    public void testSortItemsByTopSeller(){
        HomePage home =new HomePage(driver);
        ResultPage resultPage=new ResultPage(driver);
         home.typeOnsearchfield();
         resultPage.selectFromsortBy();

    }
}

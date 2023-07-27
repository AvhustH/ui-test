package qa.project;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertTrue;
import static qa.project.Additional.MainPage.inputSearch;
import static qa.project.Additional.MainPage.searchButton;
import static qa.project.Additional.Methods.getPriseProduct;
import static qa.project.Additional.SearchPage.*;
import static qa.project.Additional.URL.MAIN_PAGE_URL;

public class Task5 {
    @BeforeMethod
    public void openUrl() {
        open(MAIN_PAGE_URL);
    }

    @Test
    public void checkSortOfProducts() {
        inputSearch.setValue("iphone");
        searchButton.pressEnter();
        sortProducts.click();
        selectExpensiveSortProducts.click();
        sleep(2000);//time for update
        int productFirst = getPriseProduct(priseFirstProduct);
        int productSecond = getPriseProduct(priseSecondProduct);
        boolean checkSortPrise = false;
        if (productFirst > productSecond) {
            checkSortPrise = true;
        }
        assertTrue(checkSortPrise);
    }
}

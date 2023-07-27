package qa.project;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static qa.project.Additional.Cart.*;
import static qa.project.Additional.MainPage.*;
import static qa.project.Additional.SearchPage.addFirstProduct;
import static qa.project.Additional.SearchPage.titleOfCategory;
import static qa.project.Additional.URL.MAIN_PAGE_URL;

public class Task1 {
    @BeforeMethod
    public void openUrl() {
        open(MAIN_PAGE_URL);
    }

    @Test
    public void addAndRemoveProductFromCart() {
        cartOfProducts.click();
        titleEmptyCart.shouldHave(Condition.text("Корзина пуста"));
        closeCart.click();
        inputSearch.setValue("iphone");
        searchButton.pressEnter();
        titleOfCategory.shouldHave(Condition.text("Apple iPhone"));
        addFirstProduct.click();
        cartOfProducts.click();
        titleProductAtCart.shouldHave(Condition.text("Мобильный телефон Apple iPhone 13 128GB Midnight (MLPF3HU/A)"));
        moreMenuForProduct.click();
        deleteProductOnMoreMenu.click();
        titleEmptyCart.shouldHave(Condition.text("Корзина пуста"));
    }
}

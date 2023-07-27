package qa.project;

import com.codeborne.selenide.CollectionCondition;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertEquals;
import static qa.project.Additional.MainPage.inputSearch;
import static qa.project.Additional.MainPage.searchButton;
import static qa.project.Additional.SearchPage.listOfCheckedCheckbox;
import static qa.project.Additional.SearchPage.switchToBigIcon;
import static qa.project.Additional.URL.MAIN_PAGE_URL;

public class Task4 {
    @BeforeMethod
    public void openUrl() {
        open(MAIN_PAGE_URL);
    }

    @Test
    public void checkChangeIconOfProductsToBigIcon() {
        inputSearch.setValue("iphone 13");
        searchButton.pressEnter();
        listOfCheckedCheckbox.shouldHave(CollectionCondition.size(4));
        assertEquals($x("//a[@href= 'https://rozetka.com.ua/apple_iphone_13_128gb_midnight/p318463663/'][@class='goods-tile__picture ng-star-inserted']").getCssValue("width"), "171.438px");
        assertEquals($x("//a[@href= 'https://rozetka.com.ua/apple_iphone_13_128gb_midnight/p318463663/'][@class='goods-tile__picture ng-star-inserted']").getCssValue("height"), "226.275px");
        switchToBigIcon.click();
        assertEquals($x("//a[@href= 'https://rozetka.com.ua/apple_iphone_13_128gb_midnight/p318463663/'][@class='goods-tile__picture ng-star-inserted']").getCssValue("width"), "222.5px");
        assertEquals($x("//a[@href= 'https://rozetka.com.ua/apple_iphone_13_128gb_midnight/p318463663/'][@class='goods-tile__picture ng-star-inserted']").getCssValue("height"), "293.7px");
    }

}

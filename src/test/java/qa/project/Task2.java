package qa.project;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static qa.project.Additional.MainPage.inputSearch;
import static qa.project.Additional.MainPage.searchButton;
import static qa.project.Additional.SearchPage.listOfCategory;
import static qa.project.Additional.SearchPage.titleOfCategory;
import static qa.project.Additional.URL.MAIN_PAGE_URL;

public class Task2 {
    @BeforeMethod
    public void openUrl() {
        open("https://rozetka.com.ua");
    }

    @Test
    public void checkCountAndTitleCategoryApple() {
        open(MAIN_PAGE_URL);
        inputSearch.setValue("Apple");
        searchButton.click();
        listOfCategory.shouldHave(CollectionCondition.size(20));
        $x("//a[@href='https://rozetka.com.ua/dvd-hd-players/c80011/producer=apple/'][@class = 'tile-cats__picture']").click();
        titleOfCategory.shouldHave(Condition.text("Приставки Apple TV"));
    }
}

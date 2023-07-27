package qa.project;

import com.codeborne.selenide.CollectionCondition;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static qa.project.Additional.MainPage.inputSearch;
import static qa.project.Additional.MainPage.searchButton;
import static qa.project.Additional.SearchPage.*;
import static qa.project.Additional.URL.MAIN_PAGE_URL;

public class Task3 {
    @BeforeMethod
    public void openUrl() {
        open(MAIN_PAGE_URL);
    }

    @Test
    public void checkCheckedCheckboxesAfterSearching() {
        inputSearch.setValue("iphone 13");
        searchButton.pressEnter();
        listOfCheckedCheckbox.shouldHave(CollectionCondition.size(4));
        $$x("//a[@class = 'checkbox-filter__link checkbox-filter__link--checked'][@data-id='iPhone 13']").shouldHave(CollectionCondition.size(1));
        $$x("//a[@class = 'checkbox-filter__link checkbox-filter__link--checked'][@data-id='iPhone 13 mini']").shouldHave(CollectionCondition.size(1));
        $$x("//a[@class = 'checkbox-filter__link checkbox-filter__link--checked'][@data-id='iPhone 13 Pro Max']").shouldHave(CollectionCondition.size(1));
        checkboxRozetka.click();
        listOfCheckedCheckbox.shouldHave(CollectionCondition.size(5));
        checkedCheckboxRozetka.shouldHave(CollectionCondition.size(1));
    }

}

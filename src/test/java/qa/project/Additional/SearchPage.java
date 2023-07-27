package qa.project.Additional;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    public static SelenideElement priseFirstProduct = $x("//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted'][1]//span[@class='goods-tile__price-value'][1]");
    public static SelenideElement priseSecondProduct = $x("//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted'][2]//span[@class='goods-tile__price-value'][1]");
    public static SelenideElement sortProducts = $x("//select[@class= 'select-css ng-untouched ng-pristine ng-valid ng-star-inserted']");
    public static SelenideElement selectExpensiveSortProducts = $x("//option[@value= '2: expensive']");
    public static SelenideElement checkboxRozetka = $x("//a[@class = 'checkbox-filter__link'][@data-id='Rozetka']");
    public static SelenideElement switchToBigIcon = $x("//button[@class = 'catalog-view__button ng-star-inserted']");
    public static SelenideElement titleOfCategory = $x("//h1[@class = 'catalog-heading ng-star-inserted']");
    public static SelenideElement addFirstProduct = $x("//li[@class='catalog-grid__cell catalog-grid__cell_type_slim ng-star-inserted'][1]//button[@class='buy-button goods-tile__buy-button ng-star-inserted']");
    public static ElementsCollection checkedCheckboxRozetka = $$x("//a[@class = 'checkbox-filter__link checkbox-filter__link--checked'][@data-id='Rozetka']");
    public static ElementsCollection listOfCheckedCheckbox = $$x("//a[@class = 'checkbox-filter__link checkbox-filter__link--checked']");
    public static ElementsCollection listOfCategory = $$x("//li[@class='portal-grid__cell ng-star-inserted']");
}

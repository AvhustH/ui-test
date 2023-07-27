package qa.project.Additional;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public static SelenideElement inputSearch = $x("//input[@class = 'search-form__input ng-untouched ng-pristine ng-valid']");
    public static SelenideElement searchButton = $x("//button[@class = 'button button_color_green button_size_medium search-form__submit']");
    public static SelenideElement cartOfProducts = $x("//rz-cart[@class='header-actions__component']");
}

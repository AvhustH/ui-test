package qa.project.Additional;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Cart {
    public static SelenideElement titleEmptyCart = $x("//h4[@class='cart-dummy__heading'][text()='Корзина пуста']");
    public static SelenideElement closeCart = $x("//button[@class='modal__close']");
    public static SelenideElement titleProductAtCart = $x("//a[@class='cart-product__title']");
    public static SelenideElement moreMenuForProduct = $x("//*[@id='cartProductActions0']");
    public static SelenideElement deleteProductOnMoreMenu = $x("//*[@id='cartProductActions0']//button[@class='button button--medium button--with-icon button--link']");
}

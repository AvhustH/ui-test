package qa.project.Additional;

import com.codeborne.selenide.SelenideElement;

public class Methods {
public static int getPriseProduct(SelenideElement selector){
String test = selector.text().replace("₴","");
    return Integer.parseInt(test.replace(" ",""));
}
}

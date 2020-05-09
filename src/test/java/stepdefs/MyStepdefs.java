package stepdefs;

import cucumber.api.java.ru.И;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static pages.AbstractPage.getPageByTitle;
import static pages.AbstractPage.getUrlByTitle;

public class MyStepdefs {

    @И("Начинаем тест")
    public void начинаемТест() {

    }

    @И("открываем страницу {string}")
    public void открываемСайт(String site) throws ClassNotFoundException {
        open(getUrlByTitle(site));
    }

    @И("на странице {string} выбираем вкладу {string}")
    public void выбираемВкладуТемы(String title, String tabName) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        getPageByTitle(title).getElementByName(tabName).click();
    }

    @И("считаем темы")
    public void считаемТемы(Map<String, String> params) {

    }

    @И("Начинаем тест {string}")
    public void начинаемТест(String arg0) {
        System.out.println(arg0);
    }
}

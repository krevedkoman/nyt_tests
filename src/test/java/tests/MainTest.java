package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import pages.ApisPage;
import pages.ArchProdPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainTest {

    @Test
    void mainTest(){
        // browser configuration
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;

        MainPage mainPage = new MainPage();
        ApisPage apisPage = new ApisPage();
        ArchProdPage archProdPage = new ArchProdPage();
        // open main page
        open(mainPage.getNyt_url());
        // looking by text
        $(byText(mainPage.getNyt_apis_page_selector())).click();
        // looking for CSS selector
        $(apisPage.getNyt_apis_page_search_selector())
                .setValue(apisPage.getNyt_apis_page_search_value()).click();
        // looking for Xpath
        $(byXpath(apisPage.getNyt_apis_page_search_result_selector()))
                .shouldHave(text(apisPage.getNyt_apis_page_search_value())).click();
        // looking for CSS class name
        $(archProdPage.getNyt_api_archive_product_looking_selector())
                .shouldHave(text(archProdPage.getGetNyt_api_archive_product_looking_value()));
    }
}

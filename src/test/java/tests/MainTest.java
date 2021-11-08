package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import pages.ApisPage;
import pages.ArchProdPage;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainTest {

    @Test
    void mainTest(){
        // browser configuration
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;

        MainPage mainPage = new MainPage();
        ApisPage apisPage = new ApisPage();
        ArchProdPage archProdPage = new ArchProdPage();
        // open main page
        open(mainPage.getNyt_url());
        // looking by text
        $(byText(mainPage.getNyt_apis_page_selector())).click();
        // looking by CSS selector
        $(apisPage.getNyt_apis_page_search_selector())
                .setValue(apisPage.getNyt_apis_page_search_value()).click();
        // looking in collection of elements by search results
        $$(apisPage.getNyt_apis_page_search_result_selector())
                .first().$("a").click();
        // looking by CSS class name
        $(archProdPage.getNyt_api_archive_product_looking_selector())
                .shouldHave(text(archProdPage.getGetNyt_api_archive_product_looking_value()));
    }
}

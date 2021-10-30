package pages;

public class MainPage {

    private String nyt_url = "https://developer.nytimes.com/";
    private String nyt_apis_page_selector = "//*[@id=\"index\"]/div/ng-component/page-content/div/div[2]/mat-card[2]/a";

    public String getNyt_url() {
        return nyt_url;
    }

    public String getNyt_apis_page_selector() {
        return nyt_apis_page_selector;
    }
}

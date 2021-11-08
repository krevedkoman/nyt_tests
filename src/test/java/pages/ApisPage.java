package pages;

public class ApisPage {

    private String nyt_apis_page_search_selector = "[id=mat-input-0]";
    private String nyt_apis_page_search_result_selector = ".api-results-container";
    private String nyt_apis_page_search_value = "Archive API";

    public String getNyt_apis_page_search_selector() {

        return nyt_apis_page_search_selector;
    }

    public String getNyt_apis_page_search_result_selector() {

        return nyt_apis_page_search_result_selector;
    }

    public String getNyt_apis_page_search_value() {

        return nyt_apis_page_search_value;
    }
}

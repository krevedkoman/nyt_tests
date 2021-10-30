package pages;

public class ApisPage {

    private String nyt_apis_page_search_selector = "/html/body/app/template-component/div/div/api-list/div[1]/div[1]/mat-card/mat-card-content/mat-form-field/div/div[1]/div[4]/input";
    private String nyt_apis_page_search_result_selector = "//*[@id=\"archive-product\"]";
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

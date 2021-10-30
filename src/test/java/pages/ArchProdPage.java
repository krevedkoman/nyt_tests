package pages;

public class ArchProdPage {

    private String nyt_api_archive_product_looking_selector = "//*[@id=\"docs\"]/div/ng-component/smartdocs/mat-sidenav-container/mat-sidenav-content/div/docs-content/div";
    private String getNyt_api_archive_product_looking_value = "https://api.nytimes.com/svc/archive/v1/2019/1.json?api-key=yourkey\n";

    public String getNyt_api_archive_product_looking_selector() {
        return nyt_api_archive_product_looking_selector;
    }

    public String getGetNyt_api_archive_product_looking_value() {
        return getNyt_api_archive_product_looking_value;
    }
}

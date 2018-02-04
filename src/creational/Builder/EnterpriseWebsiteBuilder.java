package creational.Builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder{

    @Override
    void buildName() {
        website.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.DRUPAL);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}

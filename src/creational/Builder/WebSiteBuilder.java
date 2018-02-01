package creational.Builder;

public abstract class WebSiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void builPrice();

    Website getWebsite() {
        return website;
    }
}
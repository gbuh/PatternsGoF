package behavioral.TemplateMethod;

public class NewsSite extends SiteTemplate {

    @Override
    public void getContent() {
        System.out.println("News, news, news...");
    }
}

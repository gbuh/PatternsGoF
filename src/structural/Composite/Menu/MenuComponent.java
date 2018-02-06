package structural.Composite.Menu;

public interface MenuComponent {
    String getName();
    void add(MenuComponent menuComponent);
    void print();
}

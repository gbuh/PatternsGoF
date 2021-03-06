package structural.Composite.Menu;

public class MenuItemFirst implements MenuComponent {
    public String name;

    public MenuItemFirst(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println("Первое блюдо: " + name);
    }
}

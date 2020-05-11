package creational.Prototype.prototype;

public abstract class Shape implements Cloneable {
    private int x;
    private int y;
    private String color;

    public abstract void draw();

    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}

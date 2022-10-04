public class Rectangle extends Shape {
    public double width;
    public double lenght;

    public Rectangle(double side, double v) {
        this.width = 1.0;
        this.lenght = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.lenght = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return width * this.lenght;
    }

    public double getPerimeter() {
        return 2 * (width + this.lenght);
    }

    public String toString() {
        return "A Rectangle with width "
                + getWidth()
                + " lenght"
                + getLenght()
                + "Which is a subclass of"
             +super.toString();
    }
}


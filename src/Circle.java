public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI ;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
   public String toString(){
      return "A Circle with radius="
               + getRadius()
               +","
               +"which is a subclass of "
              +super.toString();
   }
}

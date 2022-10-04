public class Main {
    public static void main(String[] args) {
        System.out.println("---------SHAPE----------");

        Shape shape = new Shape(" red ", false);
        System.out.println(shape);

        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle(" indigo ", false, 3.5);
        System.out.println(circle);


        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(" orange ", true, 3.8, 2.5);
        System.out.println(rectangle);

    }
}




import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];

        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("Red",true,3.5);

        System.out.println("pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }

        CircleComparator som = new CircleComparator();
        System.out.println("Comparator: " + som.compare(circles[1],circles[2]));
    }
}

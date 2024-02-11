package OCP;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Application application = new Application();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Cube(10));
        shapes.add(new Cuboid(10,20,30));
        System.out.println(application.calculateVolume(shapes));
    }
}

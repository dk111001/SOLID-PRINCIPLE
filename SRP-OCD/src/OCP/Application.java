package OCP;

import java.util.List;

public class Application {
    public int calculateVolume(List<Shape> shapes) {
        int result = 0;
        for (Shape shape : shapes) {
            result += shape.calculateVolume();
        }
        return result;
    }
}

package OCP;

public class Cuboid implements Shape{
    int length;
    int breadth;
    int height;
    Cuboid (int length, int breadth, int height) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }
    public int calculateVolume() {
        return length*breadth*height;
    }
}

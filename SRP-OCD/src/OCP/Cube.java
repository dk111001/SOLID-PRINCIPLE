package OCP;

public class Cube implements Shape{
    int length;

    Cube(int length) {
        this.length = length;
    }
    @Override
    public int calculateVolume() {
        return length*length*length;
    }
}

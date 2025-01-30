package U5T2_Constructors;

public class Prism {
    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism(int length) {
        this.length = length;
        width = length;
        height = length;
    }

    public Prism() {
        length = (int) (Math.random() * 91) + 10;
        width = (int) (Math.random() * 91) + 10;
        height = (int) (Math.random() * 91) + 10;
    }

    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public String getDimensions() {
        String str = "Length = " + length;
        str += ",\nWidth = " + width;
        str += ",\nHeight = " + height;
        return str;
    }

    public int volume() {
        return length * width * height;
    }

    public int surfaceArea() {
        return (2 * length * width) + (2 * width * height) + (2 * height * length);
    }
}
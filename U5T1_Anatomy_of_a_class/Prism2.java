public class Prism2 {
    private int length;
    private int width;
    private int height;
    private int volume;
    private int surfaceArea;
 
    public Prism2(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        volume = length * width * height;
       
        int bottomTom = length * width;
        int leftRight = length * height;
        int frontBack = width * height;
        surfaceArea = 2 * bottomTom + 2 * leftRight + 2 * frontBack;
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
 
    public int volume() {
        return volume;
    }
 
    public int surfaceArea() {
        return surfaceArea;
    }
 
    public String dimensions() {
       String str = "Length = " + length + "\n";
       str += "Width = " + width + "\n";
       str += "Height = " + height;
       return str;
    }
 }
 
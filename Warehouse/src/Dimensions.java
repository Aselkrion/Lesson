public class Dimensions {
    private final double height;
    private final double width;
    private final double length;

    public Dimensions(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    //-------------------------Function-----------------------------------------------------//

    //-------------------------SET-------------------------------------------------------------//
    public Dimensions setHeight(double height){
        return new  Dimensions(height, width, length);
    }

    public Dimensions setWidth(double width){
        return new Dimensions(height, width, length);
    }

    public Dimensions setLength(double length){
        return new Dimensions(height, width, length);
    }

    @Override
    public String toString() {
        return "Габариты груза: " +
                "\nвысота = " + height +
                "\nширина = " + width +
                "\nдлина = " + length + System.lineSeparator();
    }
}

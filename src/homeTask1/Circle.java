package homeTask1;

public class Circle {
    private double diameter=6.4;
    private double radius=3.2;


    public double getS() {
        return (Math.PI * (this.diameter * this.diameter)) / 4.0;
    }

    public double getP() {
        return 2 * Math.PI * radius;
    }
}

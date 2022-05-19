package homeTask1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Площа прямокутника 1 = " + r.getS());
        System.out.println("Периметр прямокутника 1 = " + r.getP());
        Rectangle r1 = new Rectangle(4,2);
        System.out.println("Площа прямокутника 2 = " + r1.getS());
        System.out.println("Периметр прямокутника 2  = " + r1.getP());

    }
}

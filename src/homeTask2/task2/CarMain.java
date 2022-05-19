package homeTask2.task2;

public class CarMain {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        wheel.setSize(2);
        Body body = new Body();
        body.setSize(4);
        Helm helm = new Helm();
        helm.setSize(1);
        Car bmw = new Car("bmw", helm, wheel, body);
        System.out.println(bmw);
        bmw.getBody().doubleIncreaseSize();
        bmw.getHelm().doubleIncreaseSize();
        bmw.getWheel().doubleIncreaseSize();
        System.out.println(bmw);

    }
}

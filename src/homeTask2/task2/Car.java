package homeTask2.task2;

public class Car {
    private String model;
    private Helm helm;
    private Wheel wheel;
    private Body body;


    Car(String model, Helm helm, Wheel wheel, Body body) {

        this.model = model;
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", helm=" + helm +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }


}

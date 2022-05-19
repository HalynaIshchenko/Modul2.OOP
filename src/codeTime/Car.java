package codeTime;

public class Car {
    protected String model, color;
    protected int id, price,speed;

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color, int id, int price) {
        this.model = model;
        this.color = color;
        this.id = id;
        this.price = price;
    }

    public void driveAhead() {
        System.out.println("Автомобіль " + this.model + " рухається вперед.");
    }

    public void stop() {
        System.out.println("Автомобіль " + this.model + " зупиняється.");
    }

    public void driveBack() {
        System.out.println("Автомобіль " + this.model + " рухається назад.");
    }

    public void turnRight() {
        System.out.println("Автомобіль "  + this.model + " повертає праворуч.");
    }

    public void turnLeft() {
        System.out.println("Автомобіль "  + this.model + " повертає ліворуч.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}


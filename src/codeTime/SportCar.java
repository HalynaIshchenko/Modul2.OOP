package codeTime;

public class SportCar extends codeTime.Car {
    private int maxSpeed;

    SportCar(String model, String color, int id, int price, int maxSpeed) {
        super(model,color,id,price);
        this.maxSpeed = maxSpeed;
    }
    // Overload
    public void driveAhead(int speed,int maxSpeed) {
        this.speed= speed;
        this.maxSpeed = maxSpeed;
        System.out.println("Автомобіль " + this.model + " рухається вперед зі швидкістю " + speed + " і розвиває швидкість до " + maxSpeed);
    }
    // Overload
    public void driveAhead(String speed) {
        this.speed= Integer.valueOf(speed);
        System.out.println("Автомобіль " + this.model + " рухається вперед зі швидкістю " + speed);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}


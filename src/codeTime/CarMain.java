package codeTime;

public class CarMain {
    public static void main(String[] args) {
        Car audi = new Car("audi");
     //   System.out.println(audi);
        audi.driveAhead();
        audi.driveBack();
        audi.turnLeft();
        audi.stop();

        SportCar bmw = new SportCar( "BMW", "white", 1234, 56000,3000 );
    //    System.out.println(bmw);
        bmw.driveAhead("22");
        bmw.driveAhead(22, 55);
        bmw.turnRight();
        bmw.stop();



    }
}

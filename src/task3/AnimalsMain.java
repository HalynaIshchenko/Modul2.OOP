package task3;

public class AnimalsMain {
    public static void main(String[] args) {
        Animal cat = new Animal("Кішка,", 22, 5);
        System.out.println("Назва тварини = " + cat.getName() + " Швидкість тварини = " + cat.getSpeed() +" км/год, Вік тварини = " + cat.getAge()+ " років");
        cat.setAge(6); cat.setName("Собака,"); cat.setSpeed(24);
        System.out.println("Назва тварини = " + cat.getName() + " Швидкість тварини = " + cat.getSpeed() +" км/год, Вік тварини = " + cat.getAge() + " років");
        //Назва тварини = Леопард, Швидкість тварини = 20 км/год, Вік тварини = 7 років
    }
}

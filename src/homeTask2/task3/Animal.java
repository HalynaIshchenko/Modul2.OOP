package homeTask2.task3;
//Створити конструктор з визначеними параметрами, в який необхідно ввести всі поля класу.
// Створити getters/setters до всіх полів класу.
// В методі мейн Створити екземпляр даного класу,
// за допомогою getter вивести на консоль в один рядок значення полів даного класу.
// Викликати setter, змінити значення всіх полів класу. Вивести на консоль всі поля класу, знову в один рядок.
// Значення полів довільні на Ваш розсуд. В методі мейн повинен бути створений лише один об`єкт класу Тварина.
// Вивід повинен бути написаний наступним чином:
//"Назва тварини = Леопард, Швидкість тварини = 20 км/год, Вік тварини = 7 років "
public class Animal {
private String name;
private int speed;
private int age;

    public Animal(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }
}

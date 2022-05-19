package homeTask1;

public class Rectangle {
    private int length;
    private int width;

    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    Rectangle() {
        this.length = 10;
        this.width = 5;
    }

    // обчислюємо площу;
    public int getS() {
        return this.width * this.length;
    }
    // обчислюємо периметр;
    public int getP(){
        return (this.width+this.length)*2;
    }
}

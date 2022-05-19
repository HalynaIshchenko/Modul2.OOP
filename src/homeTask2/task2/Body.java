package homeTask2.task2;

public class Body {
    private int size;

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void doubleIncreaseSize() {
        this.size = this.size * 2;
    }

    @Override
    public String toString() {
        return String.valueOf(this.size);
    }

}

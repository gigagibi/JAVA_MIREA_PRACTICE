package DopZadaniya.game2048MT;

public class Cell implements Cloneable{
    private int value;
    public Cell(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Cell multiply() {
        return new Cell(value * 2);
    }

    public Cell clone() throws CloneNotSupportedException {
        return (Cell) super.clone();
    }
}

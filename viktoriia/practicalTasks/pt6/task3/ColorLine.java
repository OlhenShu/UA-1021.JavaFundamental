package pt6.task3;

public class ColorLine extends Line {
    String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color;
        // "Color line start: " + start + ", end: " + end + ", color: " + color;
    }

/*    public void print() {
        System.out.println(this);
    }*/  // inherited
}

package pt6.task3;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {new Line(new Point(3,5), new Point(4,6)),
                new ColorLine(new Point(6,8), new Point(14,10), "red"),
                new ColorLine(new Point(2,1), new Point(4,3), "blue"),
                new Line(new Point(4, 7), new Point(8,3)),
                new ColorLine(new Point(7,4), new Point(5, 15), "white")};
        for(Line line: lines) {
            line.print();
        }
    }
}

package pt12.task2;


public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) {
        try {
            this.size = validSize(size);
            this.color = Plant.stringToColor(color);
            this.type = Plant.stringToType(type);
        } catch (SizeException | ColorException | TypeException e) {
            System.err.println(e.getMessage());
            throw new IllegalArgumentException();
        }
    }

    static Color stringToColor(String str) throws ColorException {
        try {
            return Color.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException();
        }
    }

    static Type stringToType(String str) throws TypeException {
        try {
            return Type.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException();
        }
    }

    static int validSize(int size) throws SizeException {
        if (size <= 0 || size > 10) {
            throw new SizeException();
        }
        return size;
    }

    @Override
    public String toString() {
        return "Plant size: " + size + ", color: " + color.toString().toLowerCase() + ", type: " + type.toString().toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(Type.availableTypes());
    }
}

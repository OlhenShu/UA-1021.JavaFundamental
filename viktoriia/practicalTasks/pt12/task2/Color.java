package pt12.task2;

public enum Color {
    GREEN, BLUE, RED, BROWN;

    public static String availableColors() {
        Color[] availableColors = Color.values();
        String[] colors = new String[availableColors.length];
        for (int i = 0; i < availableColors.length; i++) {
            colors[i] = availableColors[i].toString().toLowerCase();
        }
        return String.join(", ", colors);
    }
}

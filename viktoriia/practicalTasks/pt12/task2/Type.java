package pt12.task2;

public enum Type {
    ALGAE, TREE, HERB, SHRUB, CLIMBER, CREEPER;

    public static String availableTypes() {
        Type[] availableTypes = Type.values();
        String[] types = new String[availableTypes.length];
        for (int i = 0; i < availableTypes.length; i++) {
            types[i] = availableTypes[i].toString().toLowerCase();
        }
        return String.join(", ", types);
    }
}

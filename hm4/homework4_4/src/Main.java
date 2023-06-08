import java.util.Scanner;

 class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Введіть кількість студентів: ");
        int numberOfStudents = input.nextInt();


        System.out.print("Введать порароку (де 0 це зима, а 3 це осінь): ");
        int seasonChoice = input.nextInt();




        Season currentSeason = Season.values()[seasonChoice];


        Faculty faculty = new Faculty(numberOfStudents, currentSeason);


        System.out.println("Ксть студентів: " + faculty.getNumberOfStudents());
        System.out.println("Пора року: " + faculty.getCurrentSeason());
    }
}

enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Літо"),
    AUTUMN("Осінь");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
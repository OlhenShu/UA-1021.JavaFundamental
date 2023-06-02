package Viktoriia.homework.hw4;

import java.util.Scanner;

enum Season {
    WINTER("winter"), SPRING("spring"), SUMMER("summer"), AUTUMN("autumn");
    private String name;
    private Season(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

public class Faculty {
    private int numberOfStudents;
    private Season season;
    public Faculty(int numberOfStudents, Season season) {
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsNum;
        Season thisSeason;
        System.out.println("Input a number of students:");
        while ((studentsNum = scanner.nextInt()) < 0) {
            System.out.println("Please, input correct number:");
        }
        System.out.println("Input name of current season:");
        scanner.nextLine();
        String name = "";
        boolean correct = false;
        while(!correct){
            switch (name = (scanner.nextLine().toUpperCase())) {
                case "FALL":
                    name = "AUTUMN";
                    correct = true;
                    break;
                case "WINTER", "SPRING", "SUMMER", "AUTUMN":
                    correct = true;
                    break;
                default:
                    correct = false;
                    System.out.println("Please input correct name of season:");
        }
        }
        thisSeason = Season.valueOf(name);
        Faculty myFaculty = new Faculty(studentsNum, thisSeason);
        System.out.println("Your faculty has " + studentsNum + " of students. And there are " + thisSeason.getName() + " season");
    }
}


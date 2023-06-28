package pt10.task2;
import java.time.LocalDate;
import java.util.*;

//there are to way to do task 2
// 1 - Map<Integer, Employee>, class Employee with fields name, position, salary, date of birth
// 2 - several Map Integer as key and name, position, salary, date of birth as values
// I used first way to make every employee more unique
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new LinkedHashMap<>();

//        used to check proper work
//        employeeMap.put(1, new Employee("U", "D", 42, LocalDate.of(1999, 12, 30)));
//        employeeMap.put(6, new Employee("A", "E", 30, LocalDate.of(1998, 10, 26)));
//        employeeMap.put(5, new Employee("C", "W", 46, LocalDate.of(1993, 1, 13)));
//        employeeMap.put(4, new Employee("K", "P", 22, LocalDate.of(1995, 5, 5)));
//        for (Map.Entry<Integer, Employee> empl: employeeMap.entrySet()) {
//            System.out.println("Employee ID: " + empl.getKey() + ", info: " + empl.getValue());
//        }


//Addition of new employees and stop when try to add first duplicate
        Employee employee = new Employee();
        int emplID = 0;
        while (!employeeMap.containsValue(employee)) {
            employeeMap.put(emplID, employee);
            emplID++;
            System.out.println("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.println("Enter employee position: ");
            String position = scanner.nextLine();
            System.out.println("Enter employee salary: ");
            int salary = scanner.nextInt();
            System.out.println("Enter employee year of birth: ");
            int year = scanner.nextInt();
            System.out.println("Enter employee month of birth: ");
            int month = scanner.nextInt();
            System.out.println("Enter employee day of birth: ");
            int day = scanner.nextInt();
            employee = new Employee(name, position, salary, LocalDate.of(year, month, day));
            scanner.nextLine();
        }
        employeeMap.remove(0);
        System.out.println("This employee already added: " + employee + "\nAddition employee stopped");
        for (Map.Entry<Integer, Employee> empl: employeeMap.entrySet()) {
            System.out.println("Employee ID: " + empl.getKey() + ", info: " + empl.getValue());
        }

//Searching employee name by id and id by name
        System.out.println("Enter employee ID to find one: ");
        int searchedID = scanner.nextInt();
        if (employeeMap.containsKey(searchedID)) {
            System.out.println("You are search for " + employeeMap.get(searchedID));
        } else {
            System.out.println("There are no employee with ID " + searchedID);
        }

        scanner.nextLine();
        System.out.println("Enter employee name to find one: ");
        String searchedName = scanner.nextLine();
        ArrayList<Integer> keysOfSearched = new ArrayList<>(); //if there are several employee with the same name
        for (Map.Entry<Integer, Employee> empl : employeeMap.entrySet()) {
            if(empl.getValue().getName().equals(searchedName)) {
                keysOfSearched.add(empl.getKey());
            }
        }
        if (!keysOfSearched.isEmpty()) {
            for (Integer key: keysOfSearched) {
                System.out.println("You are search for employee with ID " + key);
            }
        } else {
            System.out.println("There are no employee with name " + searchedName);
        }

// Editing employees fields
        System.out.println("Do you want to edit any employee? y(yes)/n(no) \nENTER ONE LETTER y OR n");
        boolean editing = scanner.nextLine().equalsIgnoreCase("y");
        while (editing){
            System.out.println("Enter employee ID who you want to edit: ");
            int editID = scanner.nextInt();
            while (!employeeMap.containsKey(editID)) {
                System.out.println("Employee with such ID does not exist \nPlease, enter write ID: ");
                editID = scanner.nextInt();
            }
            scanner.nextLine();
            System.out.println("What data do you want update? \nn(name), p(position), s(salary), d(date of birth) \nENTER ONE LETTER");
            String dateToUpdate = scanner.nextLine();
            switch (dateToUpdate.toLowerCase()) {
                case "n" -> {
                    System.out.println("Enter new name: ");
                    String newName = scanner.nextLine();
                    employeeMap.get(editID).setName(newName);
                }
                case "p" -> {
                    System.out.println("Enter new position: ");
                    String newPosition = scanner.nextLine();
                    employeeMap.get(editID).setPosition(newPosition);
                }
                case "s" -> {
                    System.out.println("Enter new salary: ");
                    int newSalary = scanner.nextInt();
                    employeeMap.get(editID).setSalary(newSalary);
                    scanner.nextLine();
                }
                case "d" -> {
                    System.out.println("Enter new year of birth: ");
                    int newYear = scanner.nextInt();
                    System.out.println("Enter new month of birth: ");
                    int newMonth = scanner.nextInt();
                    System.out.println("Enter new day of birth: ");
                    int newDay = scanner.nextInt();
                    employeeMap.get(editID).setDateOfBirth(LocalDate.of(newYear, newMonth, newDay));
                    scanner.nextLine();
                }
                default -> System.out.println("There is incorrect type of data");
            }
            System.out.println("Updated map:");
            for (Map.Entry<Integer, Employee> empl: employeeMap.entrySet()) {
                System.out.println("Employee ID: " + empl.getKey() + ", info: " + empl.getValue());
            }
            System.out.println("Do you want perform one more edition? y(yes)/n(no) \nENTER ONE LETTER y OR n");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                editing = false;
            }
        }

// Sorting employees by custom criteria
        System.out.println("What criteria we should use to sort employee?\n i(ID), n(name), p(position), s(salary) \nENTER ONE LETTER");
        String sortCriteria = scanner.nextLine();
        List<Map.Entry<Integer, Employee>> empls = new ArrayList<>(employeeMap.entrySet());
        switch (sortCriteria.toLowerCase()) {
            case "i":
                empls.sort(new Comparator<Map.Entry<Integer, Employee>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
                        return e1.getKey().compareTo(e2.getKey());
                    }
                });
                employeeMap.clear();
                for (Map.Entry<Integer, Employee> em: empls) {
                    employeeMap.put(em.getKey(), em.getValue());
                }
                break;
            case "n":
                empls.sort(new Comparator<Map.Entry<Integer, Employee>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
                        return e1.getValue().getName().compareTo(e2.getValue().getName());
                    }
                });
                employeeMap.clear();
                for (Map.Entry<Integer, Employee> em: empls) {
                    employeeMap.put(em.getKey(), em.getValue());
                }
                break;
            case "p":
                empls.sort(new Comparator<Map.Entry<Integer, Employee>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
                        return e1.getValue().getPosition().compareTo(e2.getValue().getPosition());
                    }
                });
                employeeMap.clear();
                for (Map.Entry<Integer, Employee> em: empls) {
                    employeeMap.put(em.getKey(), em.getValue());
                }
                break;
            case "s":
                empls.sort(new Comparator<Map.Entry<Integer, Employee>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
                        return e1.getValue().getSalary() - e2.getValue().getSalary();
                    }
                });
                employeeMap.clear();
                for (Map.Entry<Integer, Employee> em: empls) {
                    employeeMap.put(em.getKey(), em.getValue());
                }
                break;
            default:
        }
        for (Map.Entry<Integer, Employee> empl: employeeMap.entrySet()) {
            System.out.println("Employee ID: " + empl.getKey() + ", info: " + empl.getValue());
        }

    }
}
package pt8;

public class Main {
    public static void main(String[] args) {
        Department dep1 = new Department("A", new Department.Address("Kyiv", "Svobody", 9));
        try {
            Department dep2 = (Department) dep1.clone();
            Department dep3 = (Department) dep1.clone();
            dep2.getAddress().setCity("Ternopil");
            dep3.setName("C");
            System.out.println(dep1);
            System.out.println(dep2);
            System.out.println(dep3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

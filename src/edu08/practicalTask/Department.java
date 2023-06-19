package edu08.practicalTask;

/**
 * 1. Create a class called Department that contains a name field of String type and an address field of Address type.
 * In the Department class, create an inner class called Address with has city and street fields of String type and building field of type int.
 * In main() method, create an instance for one department and initialize it.
 * Then, create one more department by cloning previously created department and change the city for this object.
 * Output information about all departments to the console.
 */
public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department department = (Department) super.clone();
        department.address = (Address) address.clone();
        return department;
    }

    static class Address implements Cloneable {

        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}

class DepartmentTest {
    public static void main(String[] args) {
        Department department1 = new Department("Department_1", new Department.Address("Kyiv", "Soborna", 1));

        try {
            Department department2 = (Department) department1.clone();
            department2.getAddress().setCity("Sumy");
            department2.getAddress().setStreet("Shevchenko");
            System.out.println(department1.getName() + ", " + department1.getAddress().getCity() + ", " +
                department1.getAddress().getStreet() + ", " + department1.getAddress().getBuilding());

            System.out.println(department2.getName() + ", " + department2.getAddress().getCity() + ", " +
                department2.getAddress().getStreet() + ", " + department2.getAddress().getBuilding());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}

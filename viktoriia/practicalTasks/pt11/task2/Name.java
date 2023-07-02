package pt11.task2;

public class Name {
    private String firstName;
    private String lastName;
    private String middleName;

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public String lastNameAndInitials() {
        String initials = firstName.substring(0,1).concat(". ");
        initials = initials.concat(middleName.substring(0, 1).concat("."));
        return lastName.concat(" ").concat(initials);
    }

    public String getFirstName() {
        return firstName;
    }

    public String fullName() {
        StringBuilder fullName = new StringBuilder(firstName);
        fullName.append(" ").append(middleName).append(" ").append(lastName);
        return fullName.toString();
    }
}

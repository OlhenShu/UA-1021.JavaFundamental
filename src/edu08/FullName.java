package edu08;

public class FullName implements Cloneable{
    private String firstNameString;
    private String lastNameString;

    public FullName(String firstNameString, String lastNameString) {
        this.firstNameString = firstNameString;
        this.lastNameString = lastNameString;
    }

    public String getFirstNameString() {
        return firstNameString;
    }

    public void setFirstNameString(String firstNameString) {
        this.firstNameString = firstNameString;
    }

    public String getLastNameString() {
        return lastNameString;
    }

    public void setLastNameString(String lastNameString) {
        this.lastNameString = lastNameString;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
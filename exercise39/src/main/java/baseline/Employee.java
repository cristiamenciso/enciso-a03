package baseline;

public class Employee {
    // make private variables for employee class
    private String firstName;
    private String lastName;
    private String role;
    private String separationDate;

    // make constructor for the employee
    public Employee(String firstName, String lastName, String role, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.separationDate = separationDate;
    }
    // make get and set methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSeparationDate() {
        return separationDate;
    }

    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }

}

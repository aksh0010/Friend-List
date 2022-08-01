public class Person {
    private String firstName;
    private String lastName;
    private String cellNum;
    private int birthMonth;
    private int birthDay;

    // !! Constructers below
    public Person() {
        this.birthDay = 0;
        this.birthMonth = 0;
        this.firstName = "No first name yet ";
        this.lastName = "No last name yet ";
        this.birthDay = 0;
        this.birthMonth = 0;
        this.cellNum = "0";
    }

    public Person(String firstname) {
        this.firstName = firstname;
    }

    public Person(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;

    }

    public Person(String firstName, String LastName, int birthMonth) {
        this(firstName, LastName);
        this.birthMonth = birthMonth;

    }

    public Person(String firstName, String LastName, int birthMonth, int birthDay) {
        this(firstName, LastName, birthMonth);
        this.birthDay = birthDay;
    }

    public Person(String firstName, String LastName, int birthMonth, int birthDay, String phoneString) {
        this(firstName, LastName, birthMonth, birthDay);
        this.cellNum = phoneString;
    }

    // !! Constructers above
    // !! _________________________________________________________________
    // !! Methods below

    // ?? Setter methods
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }

    // ?? getter methods
    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellNum() {
        return cellNum;
    }

    // !! Methods above

    // !! toString method below
    @Override
    public String toString() {
        return " Name: " + getFirstName() + " " + getLastName() + " ,Birth month: " + getBirthMonth() + " ,BirthDay: "
                + getBirthDay() + " ,CellNum: " + getCellNum();
    }

}

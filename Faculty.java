package Inheritance;

import java.util.Date;

public class Faculty extends Employee {
    // Data fields
    private String officeHours;
    private String rank;

    // Constructor
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    
    @Override
    public String toString() {
        return "Faculty: " + getName();
    }
}
package kz.aitu.oop.practice.assignment4.entities;
/*It is the Entity that is the element of Java code
that is mapped to the relational database table.*/
public class Employee { //declared class
    private int id;
    private String name;
    private String surname;
    private String gender;
    public int dep_id;

    public Employee() { //constructor
    }


    public Employee(String name, String surname, String gender, int dep_id) { //constructor
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dep_id = dep_id;
    }

    public Employee(int id, String name, String surname, String gender, int dep_id) { //constructor
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dep_id = dep_id;
    }

    public int getId() { return id; } //method for getting the field value

    public String getName() {
        return name;
    } //method for getting the field value

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getDep_id() { return dep_id; }

    public void setId(int id) {
        this.id = id;
    } //method for setting the field value

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDep_id(int dep_id) { this.dep_id = dep_id; } //method for setting the field value

    @Override
    public String toString() { //to provide clear and sufficient information about the object
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dep_id=" + dep_id +
                '}';
    }
}

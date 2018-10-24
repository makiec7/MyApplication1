package support;

public class Person {

    private boolean status;
    private double height;
    private String surname;
    private String name;

    public Person(String name, String surname, double height, boolean status) {
        this.name=name;
        this.surname=surname;
        this.height=height;
        this.status = status;
    }

    public double getHeight() {
        return height;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height=height;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

    public void setName(String name) {
        this.name=name;
    }


    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status=status;
    }
}

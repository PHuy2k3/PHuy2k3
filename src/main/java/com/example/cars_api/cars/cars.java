package com.example.cars_api.cars;

public class cars {
    private Long id;
    private String Name;
    private String serial;
    private int year;

    public cars() {
    }

    public cars(Long id, String name, String serial, int year) {
        this.id = id;
        Name = name;
        this.serial = serial;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getSerial() {
        return serial;
    }

    public int getYear() {
        return year;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "cars{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", serial='" + serial + '\'' +
                ", year=" + year +
                '}';
    }
}

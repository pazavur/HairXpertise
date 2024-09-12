package com.nctech.hairxpertise.dtos;

public class AdminDTO {

    private int id;
    private String name;
    private String address;
    private int age;
    private int axperianceInYear;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAxperianceInYear() {
        return axperianceInYear;
    }

    public void setAxperianceInYear(int axperianceInYear) {
        this.axperianceInYear = axperianceInYear;
    }
    public int getId(AdminDTO admin) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
}

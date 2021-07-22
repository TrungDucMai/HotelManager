package com.company;

public class Guest extends Hotel {
    private String name;
    private String birth;
    private String id;

    public Guest(){};
    public Guest(String name, String birth, String id) {
        this.name = name;
        this.birth = birth;
        this.id = id;
    }

    public Guest(double stayTime, String roomStyle, double roomPrice, String name, String birth, String id) {
        super(stayTime, roomStyle, roomPrice);
        this.name = name;
        this.birth = birth;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

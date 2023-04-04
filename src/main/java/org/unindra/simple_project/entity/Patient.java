package org.unindra.simple_project.entity;

import org.unindra.simple_project.annotation.Column;
import org.unindra.simple_project.annotation.Id;
import org.unindra.simple_project.annotation.Table;

@Table(name = "m_patient")
public class Patient {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "address")
    private String address;
    @Column(name = "blood_type")
    private String bloodType;

    public Patient(String id, String name, String gender, String address, String bloodType) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.bloodType = bloodType;
    }

    public Patient() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }
}

package com.dbproject.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int year;
    private String colour;
    private char fuelType;
    private int kms;
    private int hp;
    private float value;
    private int available;

    @ManyToOne
    private Location location;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Model model;

    //TODO check if this should be a fk, if so can it be null??
    private int orderID;

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id &&
                year == vehicle.year &&
                fuelType == vehicle.fuelType &&
                kms == vehicle.kms &&
                hp == vehicle.hp &&
                Float.compare(vehicle.value, value) == 0 &&
                available == vehicle.available &&
                orderID == vehicle.orderID &&
                Objects.equals(colour, vehicle.colour) &&
                Objects.equals(location, vehicle.location) &&
                Objects.equals(user, vehicle.user) &&
                Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year, colour, fuelType, kms, hp, value, available, location, user, model, orderID);
    }
}

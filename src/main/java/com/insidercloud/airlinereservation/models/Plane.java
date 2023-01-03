package com.insidercloud.airlinereservation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Plane {
    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String model;

    @Field
    private String manufacturer;

    @Field
    private String firstClassSeats;

    @Field
    private String businessClassSeats;

    @Field
    private String economyClassSeats;

    public Plane(){}

    public Plane(String name, String model, String manufacturer, String firstClassSeats, String businessClassSeats, String economyClassSeats) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.firstClassSeats = firstClassSeats;
        this.businessClassSeats = businessClassSeats;
        this.economyClassSeats = economyClassSeats;
    }

    public String getBusinessClassSeats() {
        return businessClassSeats;
    }

    public String getEconomyClassSeats() {
        return economyClassSeats;
    }

    public String getFirstClassSeats() {
        return firstClassSeats;
    }

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public void setBusinessClassSeats(String businessClassSeats) {
        this.businessClassSeats = businessClassSeats;
    }

    public void setEconomyClassSeats(String economyClassSeats) {
        this.economyClassSeats = economyClassSeats;
    }

    public void setFirstClassSeats(String firstClassSeats) {
        this.firstClassSeats = firstClassSeats;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Plane[id='%s',name='%s', model='%s', manufacturer='%s', firstClassSeats='%s', businessClassSeats='%s', economyClassSeats='%s']",id,name,model,manufacturer,firstClassSeats,businessClassSeats,economyClassSeats);
    }
}
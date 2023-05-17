package com.insidercloud.airlinereservation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class FlightSchedule {
    @Id
    private String id;
    @Field
    private String flightId;
    @Field
    private String flightName;
    @Field
    private String flightDate;
    @Field
    private String flightTime;
    @Field
    private String flightFrom;
    @Field
    private String flightTo;
    @Field
    private String flightPrice;
    @Field
    private List<Seat> flightSeats;
    @Field
    private String flightDuration;
    @Field
    private String flightAirline;
    @Field
    private String flightAirlineLogo;

    public FlightSchedule(){}

    public FlightSchedule(String flightId, String flightName, String flightDate, String flightTime, String flightFrom, String flightTo, String flightPrice, String flightDuration, String flightAirline, String flightAirlineLogo) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightPrice = flightPrice;
        this.flightDuration = flightDuration;
        this.flightAirline = flightAirline;
        this.flightAirlineLogo = flightAirlineLogo;
    }

    @Override
    public String toString(){
        return String.format("FlightSchedule[id='%s',flightId='%s', flightName='%s', flightDate='%s', flightTime='%s', flightFrom='%s', flightTo='%s', flightPrice='%s', flightSeats='%s', flightDuration='%s', flightAirline='%s', flightAirlineLogo='%s']",id,flightId,flightName,flightDate,flightTime,flightFrom,flightTo,flightPrice,flightSeats,flightDuration,flightAirline,flightAirlineLogo);
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public String getFlightAirlineLogo() {
        return flightAirlineLogo;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getId() {
        return id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public String getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(String flightPrice) {
        this.flightPrice = flightPrice;
    }

    public List<Seat> getFlightSeats() {
        return flightSeats;
    }

    public void setFlightSeats(List<Seat> flightSeats) {
        this.flightSeats = flightSeats;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    public void setFlightAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    public void setFlightAirlineLogo(String flightAirlineLogo) {
        this.flightAirlineLogo = flightAirlineLogo;
    }

}

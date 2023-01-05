package com.insidercloud.airlinereservation.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class UserTickets {
    @Id
    private String ticketId;
    @Field
    private String userId;
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
    private String flightSeats;
    @Field
    private String flightClass;
    @Field
    private String flightDuration;
    @Field
    private String flightAirline;
    @Field
    private String flightAirlineLogo;

    public UserTickets(String ticketId, String userId, String flightId, String flightName, String flightDate, String flightTime, String flightFrom, String flightTo, String flightPrice, String flightSeats, String flightClass, String flightDuration, String flightAirline, String flightAirlineLogo) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.flightId = flightId;
        this.flightName = flightName;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightPrice = flightPrice;
        this.flightSeats = flightSeats;
        this.flightClass = flightClass;
        this.flightDuration = flightDuration;
        this.flightAirline = flightAirline;
        this.flightAirlineLogo = flightAirlineLogo;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getFlightDate() {
        return flightDate;
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

    public String getFlightFrom() {
        return flightFrom;
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

    public String getFlightSeats() {
        return flightSeats;
    }

    public void setFlightSeats(String flightSeats) {
        this.flightSeats = flightSeats;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public void setFlightAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    public String getFlightAirlineLogo() {
        return flightAirlineLogo;
    }

    public void setFlightAirlineLogo(String flightAirlineLogo) {
        this.flightAirlineLogo = flightAirlineLogo;
    }
}

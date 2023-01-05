package com.insidercloud.airlinereservation.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "seat")
public class Seat {
    private String seatId;
    private String seatType;
    private String seatStatus;
    private String seatPrice;
    private String seatAvailability;
    private String seatClass;
    private String seatNumber;
    private String seatRow;
    private String seatColumn;
    private String seatFloor;
    private String seatAisle;
    private String seatWindow;
    private String seatMiddle;

    public Seat(String seatId, String seatType, String seatStatus, String seatPrice,
            String seatAvailability, String seatClass, String seatNumber, String seatRow,
            String seatColumn, String seatFloor, String seatAisle, String seatWindow,
            String seatMiddle) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
        this.seatPrice = seatPrice;
        this.seatAvailability = seatAvailability;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
        this.seatRow = seatRow;
        this.seatColumn = seatColumn;
        this.seatFloor = seatFloor;
        this.seatAisle = seatAisle;
        this.seatWindow = seatWindow;
        this.seatMiddle = seatMiddle;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }

    public String getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(String seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getSeatAvailability() {
        return seatAvailability;
    }

    public void setSeatAvailability(String seatAvailability) {
        this.seatAvailability = seatAvailability;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(String seatRow) {
        this.seatRow = seatRow;
    }

    public String getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(String seatColumn) {
        this.seatColumn = seatColumn;
    }

    public String getSeatFloor() {
        return seatFloor;
    }

    public void setSeatFloor(String seatFloor) {
        this.seatFloor = seatFloor;
    }

    public String getSeatAisle() {
        return seatAisle;
    }

    public void setSeatAisle(String seatAisle) {
        this.seatAisle = seatAisle;
    }

    public String getSeatWindow() {
        return seatWindow;
    }

    public void setSeatWindow(String seatWindow) {
        this.seatWindow = seatWindow;
    }

    public String getSeatMiddle() {
        return seatMiddle;
    }

    public void setSeatMiddle(String seatMiddle) {
        this.seatMiddle = seatMiddle;
    }

    @Override
    public String toString() {
        return "Seat [seatAisle=" + seatAisle + ", seatAvailability=" + seatAvailability
                + ", seatClass=" + seatClass + ", seatColumn=" + seatColumn + ", seatFloor="
                + seatFloor + ", seatId=" + seatId + ", seatMiddle=" + seatMiddle + ", seatNumber="
                + seatNumber + ", seatPrice=" + seatPrice + ", seatRow=" + seatRow + ", seatStatus="
                + seatStatus + ", seatType=" + seatType + ", seatWindow=" + seatWindow + "]";
    }
}
